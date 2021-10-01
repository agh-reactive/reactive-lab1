# Reactive programming in Scala - Lab 1

## Environment setup

Basic requirements:
- JDK 1.8
- [sbt 1.x](https://www.scala-sbt.org)

### IDE 
#### IntelliJ
- IntelliJ IDEA posiada wsparcie dla Scali w postaci pluginu, podczas instalacji należy w kroku "Featured plugins" wybrać opcję "Scala".
- Wystarczy edycja Community, ale studenci w ramach zajęć mogą korzystać ze [specjalnej licencji studenckiej](https://www.jetbrains.com/community/education), która obejmuje wersję Ultimate. Podczas rejestracji należy skorzystać z adresu email znajdującego się w domenie .edu.pl.
- [Link bezpośredni do pobierania IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows)
- [Podstawy pracy nad projektami Scala w IntelliJ IDEA](https://docs.scala-lang.org/getting-started/intellij-track/building-a-scala-project-with-intellij-and-sbt.html)
- Projekty korzystające z SBT wystarczy "otworzyć", nie trzeba ich "importować"
- Podczas zajęć korzystamy z projektów typu "Scala SBT", co pozwala zachować przenośność w przeciwieństwie do projektów zarządzanych jako zwykłe projekty Scala w IntelliJ.
- Po pierwszym otworzeniu projektu w IntelliJ, na pytanie czy zaimportować zmiany w projekcie czy włączyć autoimportowanie, warto wybrać opcję automatycznego importu zmian.
- Niektóre opcje i funkcje IDE będą dostępne dopiero po zaimportowaniu zależności projektu i zakończeniu skanowania środowiska.

#### VSC
To use Visual Studio Code, you need the **Metals** plugin. After opening a project (`File -> Open`), a Build Server (Bloop) and a Language Server (Metals) will run in the background. Learn more about [running your code](https://scalameta.org/metals/docs/editors/vscode/#running-and-debugging-your-code).

## Resources

[Scala language](https://www.scala-lang.org)

[Coursera Functional Programming Principles in Scala](https://www.coursera.org/learn/scala-functional-programming)

Worth reading:
- [OOO vs FP the pursuit of extensibility part 1](https://medium.com/virtuslab/oop-vs-fp-the-pursuit-of-extensibility-part-1-31029591c3b4)
- [OOO vs FP - Type Classes](https://medium.com/virtuslab/oop-vs-fp-the-pursuit-of-extensibility-part-2-22a37a33d1a0)
- [FP in Scala - Typelevel Cats library](https://typelevel.org/cats)


## Exercise

Getting source code:
```
git clone https://github.com/agh-reactive/reactive-lab1
```


Running:
```
cd reactive-lab1
sbt run
```

When using IntelliJ, open the project and run it  with the built-in SBT task (`Run...` and `edit configurations`), or with the SBT Shell. The first time the project is opened, a dialog will pop-up for selecting JRE and selecting which  SBT to use (manually installed or attached to IntelliJ).


## Assignment

Read the following:
- https://doc.akka.io/docs/akka/current/typed/guide/introduction.html
- https://doc.akka.io/docs/akka/current/typed/guide/actors-motivation.html
- https://doc.akka.io/docs/akka/current/typed/guide/actors-intro.html
- https://doc.akka.io/docs/akka/current/typed/guide/modules.html





