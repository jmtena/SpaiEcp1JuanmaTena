@echo off
set workspace=C:\Users\jtenaescob001\workspace_eclipse\SPAI-ECP1\workspace_ecp1\juanmanuel.tena.ecp1.miw.upm.es
set PATH=%PATH%C:\Program Files\Java\jdk1.8.0_60\bin;C:\apache-maven-3.3.3\bin
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
set M2_HOME=C:\apache-maven-3.3.3

echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------

echo .
cd %workspace%
echo ============ mvn --version =======================================================
echo .

call mvn -Denvironment.type=develop clean test
pause
exit
