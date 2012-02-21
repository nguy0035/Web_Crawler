Date 22 Feb 2012.

Create a web crawler to crawl a newspaper and search for a keyword and display a list of webpages URL link that related to the keyword
create a multi-threaded web crawler so that it can search for multiple pre-defined website at the same time

Note: Only search for within a website ONLY

Note: a list of website is kept in database

Simple algo: to see whether this web page talk about the keyword is by searching the TAG. Implemented this first.

Command : java -k "KEYWORD" -m NUMBER -mt NUMBER

-k :  To enter a keyword to a search box [required]
-m :  maximum URL want to print out. Default = 100
-mt : number of threads. Default = 10