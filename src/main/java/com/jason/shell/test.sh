##!/usr/bin/env bash
#!/bin/bash
echo "Hi,Jason"

var=chenchen#赋值操作
i=1
#var = chenchen#相等操作
#可以使用$加变量名打印变量值
echo $var  #方式一
echo ${var} #方式二

echo $i $var


echo $PATH


##标准变量和环境变量
##获取字符串的长度 length=${#var}
str=chenchen123
echo "str length:${#str}"
##识别当前所使用的shell  $SHELL也可以用$0
echo $SHELL  $0
##检查是否为超级用户 UID是一个重要的环境变量，UID=0表明是root
##  eq 就是 EQUAL等于
##  ne就是 NOT EQUAL不等于
##  gt 就是 GREATER THAN大于　
##  lt 就是 LESS THAN小于
##  ge 就是 GREATER THAN OR EQUAL 大于等于
##  le 就是 LESS THAN OR EQUAL 小于等于
##方式一
if test $UID != 0; then
    echo "This is root"
else
    echo "this ordinary root"
fi
##方式二
if [ $UID -ne 0 ]; then
    echo "$UID != 0"
else
    echo "other"
fi
##使用系统函数  prepend()
# prepend /opt/myapp/bin:$PATH /opt/myapp/bin
##利用let、（（））、[]、expr、bc函数
##当使用let时，变量名之前不需要再添加$
a=1
b=2
let result=a+b
echo $result
##自加操作
let a++
##自减操作
let b--


#操作符[]的使用方法和let命令类似:
             result=$[ a + b ]
#在[]中也可以使用$前缀，例如:
#result=$[ $no1 + 5 ] 也可以使用(())，但使用(())时，变量名之前需要加上$:

  result=$(( a + 50 ))
#expr同样可以用于基本算术操作: result=`expr 3 + 4`
result=$(expr $a + 5)
#以上这些方法只能用于整数运算，而不支持浮点数。

#bc是一个用于数学运算的高级工具可以借助它来执行浮点数运算并应用一些高级函数
echo "4*0.56"|bc
c=54;
s=`echo "$c*1.5"|bc`
echo $s
#设定小树精度  scale
echo "scale=2;3/8" | bc #0.37
echo "scale=2;3/8"      #scale=2;3/8
#精制转换 obase
no=100
echo "obase=2;$no" | bc
#计算平方已经平方根
echo "sqrt(100)" | bc
echo "10^10" | bc

##文件描述符及重定向
#文件描述符   0  stdin(标准输入)， 1 stdout(标准输出)、2 stderr(标准错误)

#将输出文本重定向或保存到一个文件中
echo "this is a sample text 1" > temp.txt
#将文本追加到目标文件中
echo "this is sample text 2" >> temp.txt

ls ccccc 2>out.txt ##意思是将ls ccccc 产生的错误日志重定向到out.txt文件中

##有一个方法既可以将数据重定向到文件还可以提供一份重定向数据的副本作为后续命令的stdin tee命令
##command | tee file ,tee命令会将文件覆盖，但是它提供了一个-a选项，用于追加内容

cat temp.txt | tee test.txt
cat temp.txt | tee -a test.txt

for i in "jason"; do
  echo $i
done

st=jason
#可以将readonly修饰st,将st变成一个只读的变量

##可以使用unset命令删除变量,删除之后不能使用
unset st

##变量类型分为三种：局部变量、环境变量、shell变量

##提取子字符串
string="this is a dog"
echo ${string:1:4} #输出his
##查找子字符串，查找字符 i
echo `expr index "$string" is` ##输出 有问题需要该//TODO

##shell数组
#数组名=（值...）
strarray=(1 2 3)
#或
strarray[0]=1
strarray[1]=2
strarray[2]=3

##读取数组 ${数组名[下标]},可以使用@符获取数组中的所有元素
${strarray[0]}

# 取得数组元素的个数
length=${#array_name[@]}
# 或者
length=${#array_name[*]}
# 取得数组单个元素的长度
lengthn=${#array_name[n]}


##############################################
#1、## 表示从左边开始删除。一个 # 表示从左边删除到第一个指定的字符；两个 # 表示从左边删除到最后一个指定的字符。

#2、%% 表示从右边开始删除。一个 % 表示从右边删除到第一个指定的字符；两个 % 表示从左边删除到最后一个指定的字符。

删除包括了指定的字符本身
var=http://www.aaa.com/123.htm

#1. # 号截取，删除左边字符，保留右边字符。

echo ${var#*//}
#其中 var 是变量名，# 号是运算符，*// 表示从左边开始删除第一个 // 号及左边的所有字符

#即删除 http://

#结果是 ：www.aaa.com/123.htm

#2. ## 号截取，删除左边字符，保留右边字符。

echo ${var##*/}
##*/ 表示从左边开始删除最后（最右边）一个 / 号及左边的所有字符

#即删除 http://www.aaa.com/

#结果是 123.htm

#3. %号截取，删除右边字符，保留左边字符

echo ${var%/*}
#%/* 表示从右边开始，删除第一个 / 号及右边的字符

#结果是：http://www.aaa.com

#4. %% 号截取，删除右边字符，保留左边字符

echo ${var%%/*}
#%%/* 表示从右边开始，删除最后（最左边）一个 / 号及右边的字符

#结果是：http:

#5. 从左边第几个字符开始，及字符的个数

echo ${var:0:5}
#其中的 0 表示左边第一个字符开始，5 表示字符的总个数。

#结果是：http:

#6. 从左边第几个字符开始，一直到结束。

echo ${var:7}
#其中的 7 表示左边第8个字符开始，一直到结束。

#结果是 ：www.aaa.com/123.htm

#7. 从右边第几个字符开始，及字符的个数

echo ${var:0-7:3}
#其中的 0-7 表示右边算起第七个字符开始，3 表示字符的个数。

#结果是：123

#8. 从右边第几个字符开始，一直到结束。

echo ${var:0-7}
#表示从右边第七个字符开始，一直到结束。

#结果是：123.htm

#注：（左边的第一个字符是用 0 表示，右边的第一个字符用 0-1 表示）

#########################################################
#    在编写shell时，向脚本传递参数，脚本里获取参数的格式为：$n 其中n是整数，从1开始，其中$0表示当前执行文件的文件名


