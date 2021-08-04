# CrisprCas9
Genome sequencing using Spring Batch and an algorithm of DNA pattern recognition here I used Karp Rabin 

A Java IT Model for DNA damage repair and Genome sequencing solution to fight Covid19 and other diseases
Author: Wadï Mami
17/06/2020
email: didipostman77@gmail.com


![alt text](https://external.ftun10-1.fna.fbcdn.net/safe_image.php?d=AQCXl9YSmOIjP7S-&w=500&h=261&url=https%3A%2F%2Fcamo.githubusercontent.com%2F5be13d5e423df76ff1715f40c0e3c1d51e79bc2f%2F68747470733a2f2f312e62702e626c6f6773706f742e636f6d2f2d4935587539366b7758784d2f584e4d345a704831335f492f414141414141414141414d2f682d6a5174665f735373414a6a4d7278565a643866776f4575542d59726b424241434c63424741732f73313630302f46425f494d475f313535373334363333353432392e6a7067&cfs=1&ext=jpg&_nc_cb=1&_nc_hash=AQBn0rdB1Ny-sNgD)

Abstract

Here I share with you my IT model for DNA damage repair and Genome Sequencing Solution. It
can be used to fight covid19 or any other disease, or as a genetic framework like
Crispr cas9 or to figure out a vaccine or medicines.

The Model
Since 2012 I tried a theory an IT model for DNA damage repair and genome sequencing solution
based on an open source framework java which is Spring Batch + an algorithm of DNA pattern
recognition.I did a template project to more explain
here You will find a fully présentation of it. You just have to read the readme file and explore the source code I used a template code of *
@author bruce.liu(mailto:jxta.liu@gmail.com) Very special thanks to him. The source code
template is in Github under MIT licence.

I thaugt even to go further to read all the human DNA by using Spring batch integration and using GridGain.

I think only one instance of Spring Batch + an algorithm of DNA pattern recognition may be the
solution to create a virus, a drugs or genetic framework like Crispr Cas 9 based on that architecture
It could help against covid 19 as we know RNA responsible of it.

As I told you before it is only the concept a simple sample, an idea in my point of view worth to be
considered a hard work remains to be done.

I cant go further with it may be someone find it useful and continue.

I will try to more present my model for drugs discovery against Covid19 Cancer diabete and many other diseases. In fact my IT model could explain how Crispr Cas9 Works and then creating drugs based on that model may could be possible.

CRISPR-Cas9

CRISPR-Cas9 was adapted from a naturally occurring genome editing system in bacteria. The bacteria capture snippets of DNA from invading viruses and use them to create DNA segments known as CRISPR arrays.The CRISPR arrays allow the bacteria to "remember" the viruses (or closely related ones). If the viruses attack again, the bacteria produce RNA segments from the CRISPR arrays to target the viruses' DNA. The bacteria then use Cas9 or a similar enzyme to cut the DNA apart, which disables the virus.

The Model

the Architecture sequence diagram describing how Spring Batch[1] function and the dependency between Spring Batch Core and item reader, item Processor and item Writer + karp Rabin ( or any other pattern recognition algorithm) = How CRISPR Cas9 works see picture below

![alt text](https://external.ftun10-1.fna.fbcdn.net/safe_image.php?d=AQCXl9YSmOIjP7S-&w=500&h=261&url=https%3A%2F%2Fcamo.githubusercontent.com%2F5be13d5e423df76ff1715f40c0e3c1d51e79bc2f%2F68747470733a2f2f312e62702e626c6f6773706f742e636f6d2f2d4935587539366b7758784d2f584e4d345a704831335f492f414141414141414141414d2f682d6a5174665f735373414a6a4d7278565a643866776f4575542d59726b424241434c63424741732f73313630302f46425f494d475f313535373334363333353432392e6a7067&cfs=1&ext=jpg&_nc_cb=1&_nc_hash=AQBn0rdB1Ny-sNgD)

In fact The bacteria capture snippets of DNA from invading viruses and use them to create DNA segments known as CRISPR arrays. DNA = input file or database see sequence diagram above ( Spring Batch ---> ItemReader returns item processed by ItemProcessor which returns transformed items = DNA segments known as CRISPR arrays.

The bacteria then use Cas9 or a similar enzyme to cut the DNA apart, which disables the virus. Look Spring Batch ---à ItemWriter (write(transformed items))

Here we didn’t see Karp Rabin but following the template source code

you will find a DNASequence_Processor class that implements itemProcessor and use Karp Rabin Algorithm.

Conclusion

Spring Batch + Karp Rabin = how CRISPR Cas9 works is my IT theoretical model may be it could be interesting and useful for drugs discovery. The model is an idea that had been haunting me since 2012. I share it with you. I can’t go further with it, may be you find it useful interesting and continue developement. The model is under MIT License
