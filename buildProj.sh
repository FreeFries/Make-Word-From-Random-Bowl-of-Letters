#!/usr/bin/env bash
echo "Pressing capital B will build the application"
read valOfK
echo "Input ${valOfK}"
if [ "${valOfK}" = "B"  ]
then
    mvn -P dev clean
    mvn -P dev validate
    # mvn -P dev compile - default of goal of package is to compile
    mvn -P dev package


else
    echo "Abandoned building ....."
fi

echo "Pressing capital R will run the application"
read valOfK
echo "Input ${valOfK}"
if [ "${valOfK}" = "R"  ]
then
	cd target
    java -jar APereiraCroydon_Beta1.0.jar 150 "SuperCaliFragilisticExpialidocious"

else
    echo "Abandoned running ....."
fi
