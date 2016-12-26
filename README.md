My very cheap version of the Magic 8-Ball
=========================================

Table of Contents
 - [Introduction](#introduction)
 - [Building and running](#building-and-running)
 - [Example session](#example-session)


## Introduction

It turns out that I am looking for a job near my hometown. No success for now. Companies don't even give answers to my applications or my e-mails.
A few days ago, while browsing the Web, I landed on the Wikipedia page for the [Magic 8-Ball](https://en.wikipedia.org/wiki/Magic_8-ball). I said to myself "Well, if HR people tell me nothing, maybe I should ask a fortune-teller of some kind. Let's make my own". And here it is.

This is a command line application. No fancy graphics, just text, because only text really matters...

**DISCLAIMER: I don't believe in divination and the like. Needless to say that my program does not tell any kind of fortune... It's just a game, for fun.** And incidentally a pretext to write a small program...



## Building and Running

A basic gradle script is provided.
```
$ cd magic8ball
$ gradle build
$ java -jar build/libs/magic8ball.jar
```

Alternatively, by hand:
```
$ cd magic8ball/src/main/java
$ javac MainCLI.java
$ jar cfe magic8ball.jar MainCLI *.class
$ java -jar magic8ball.jar
```



## Example session

A session I had a few minutes ago:
```
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
Welcome. Your fortune-teller will answer all your questions.
Type "quit" at any moment to leave.
=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
Please ask your question: Will I find a job?
I tell you that: Better not tell you now

Please ask your question: Will I find a job?
I tell you that: You may rely on it

Please ask your question: Will I find a job shortly?
I tell you that: Without a doubt

Please ask your question: Will I find a job within one month?
I tell you that: Reply hazy try again

Please ask your question: Will I find a job before October 2016?
I tell you that: Outlook not so good

Please ask your question: Will I find a job before November 2016?
I tell you that: Very doubtful

Please ask your question: Will I find a job before December 2016?
I tell you that: Outlook not so good

Please ask your question: Will I find a job before January 2017?
I tell you that: Most likely

Please ask your question: Will I find a job during December 2016?
I tell you that: It is certain

Please ask your question: quit
```
Okay... I will update this README file around December 2016 to add the relevant information...

**Edit 26 December 2016** (I tend to use British English date format): Hey, **I have a job!!!!** My program is not that bad after all. But there are probably some adjustments to be made.
Actually, they told me that I was hired in October, I started working on November 21st (a training and the like), and completed my first real task during the last two days of November.

---

