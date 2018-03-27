#!/usr/bin/env bash
if test -e a.txt; then
    echo "a.txt 存在"
else
    echo "不存在"
fi

#file=
echo ${PWD%/*}