# clojure-takipi-notes

A place to put tests and observations about using Takipi SAAS debugger with clojure.

## Affiliation and Accreditation

Please note that I am not in any way affiliated with Takipi team. This is an unofficial project that only demonstrates my experimentation with Clojure and Takipi. It should NOT be taken as official documentation from the Takipi team. Also, I did not have any part in the Takipi product; all credit for Takipi should go to the Takipi team.

## A note for the Clojure NYC user group

The slides form my July 2013 presentation can be found in the doc folder.

For those of you asking about Takipi's business model, looks like the plan is to charge monthly per server after the beta is over.
Source: http://www.takipi.com/faq.html -> How much does Takipi cost?

Many of you asked after the presentation if I was aware of any self-hosted solution Takipi plans to offer. They tweeted last month that they will likely have a self hosted solution in the future:
Source:  https://twitter.com/takipid/status/350953999622619138

## Usage

* Go to http://www.takipi.com/ and create an account

* Follow thier getting started guide at http://www.takipi.com/starting.html or install Takipi service manually in your shell
    wget https://s3.amazonaws.com/app-takipi-com/deploy/linux/takipi-installer;
    sudo bash takipi-installer;
    source /opt/takipi/etc/auto-agent;

* In https://app.takipi.com/ settings, make sure you have the server key added and the following in the "Top level packages":
    org;com;clojure;clojuretakipinotes

* Compile this project with lein and run it as a jar 
    lein uberjar;
    java -jar target/clojuretakipinotes-0.1.1-SNAPSHOT-standalone.jar

Note that I removed the spaces in the project name because Takipi seems to have a hard time with them.

## License

Copyright © 2013

Distributed under the Eclipse Public License, the same as Clojure.
