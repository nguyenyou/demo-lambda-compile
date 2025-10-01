```
scalac -Xprint:inline experiment.scala
```

```scala
scalac -Xprint:inline experiment.scala

[[syntax trees at end of          inlinedPositions]] // experiment.scala
package <empty> {
  @Child[(ButtonStyle.DarkMode : ButtonStyle)]
    @Child[(ButtonStyle.Secondary : ButtonStyle)] @Child[
    (ButtonStyle.Primary : ButtonStyle)] sealed abstract class ButtonStyle()
     extends Object(), scala.reflect.Enum {
    import ButtonStyle.{Primary, Secondary, DarkMode}
  }
  final lazy module val ButtonStyle: ButtonStyle = new ButtonStyle()
  final module class ButtonStyle() extends AnyRef() { this: ButtonStyle.type =>
    case <static> val Primary: ButtonStyle = ButtonStyle.$new(0, "Primary")
    case <static> val Secondary: ButtonStyle = ButtonStyle.$new(1, "Secondary")
    case <static> val DarkMode: ButtonStyle = ButtonStyle.$new(2, "DarkMode")
    private[this] val $values: Array[ButtonStyle] =
      Array.apply[ButtonStyle](
        [this.Primary,this.Secondary,this.DarkMode : ButtonStyle]*)(using
        scala.reflect.ClassTag.apply[ButtonStyle](classOf[ButtonStyle]))
    def values: Array[ButtonStyle] = ButtonStyle.$values.clone()
    def valueOf($name: String): ButtonStyle =
      $name match 
        {
          case "Primary" => this.Primary
          case "Secondary" => this.Secondary
          case "DarkMode" => this.DarkMode
          case _ =>
            throw 
              new IllegalArgumentException(
                "enum ButtonStyle has no case with name: " + $name)
        }
    private[this] def $new(_$ordinal: Int, $name: String): ButtonStyle =
      {
        final class $anon() extends ButtonStyle(), _root_.scala.runtime.
          EnumValue {}
        new $anon():(ButtonStyle & scala.runtime.EnumValue)
      }
    def fromOrdinal(ordinal: Int): ButtonStyle =
      try ButtonStyle.$values.apply(ordinal) catch 
        {
          case _ =>
            throw 
              new NoSuchElementException(
                "enum ButtonStyle has no case with ordinal: " +
                  ordinal.toString()
              )
        }
  }
  final lazy module val Style: Style = new Style()
  final module class Style() extends Object() { this: Style.type =>
    export ButtonStyle.*
    final def Primary: (ButtonStyle.Primary : ButtonStyle) = ButtonStyle.Primary
    final def DarkMode: (ButtonStyle.DarkMode : ButtonStyle) =
      ButtonStyle.DarkMode
    final def Secondary: (ButtonStyle.Secondary : ButtonStyle) =
      ButtonStyle.Secondary
  }
  case class Button(style: ButtonStyle) extends Object(), _root_.scala.Product,
    _root_.scala.Serializable {
    val style: ButtonStyle
    def copy(style: ButtonStyle): Button = new Button(style)
    def copy$default$1: ButtonStyle @uncheckedVariance = Button.this.style
    def _1: ButtonStyle = this.style
  }
  final lazy module val Button: Button = new Button()
  final module class Button() extends Object() { this: Button.type =>
    def apply(style: ButtonStyle): Button = new Button(style)
    def unapply(x$1: Button): Button = x$1
    inline transparent def apply(inline style: StyleSelector): Button =
      {
        Button.apply(style = style.apply(Style))
      }
  }
  final lazy module val experiment$package: experiment$package =
    new experiment$package()
  final module class experiment$package() extends Object() {
    this: experiment$package.type =>
    type StyleSelector = Style.type => ButtonStyle
    @main def run(): Unit =
      {
        val myButton: Button =
          Button.apply(
            style =
              {
                val _$1: Style = Style
                _$1.DarkMode
              }
          )
        println(myButton)
      }
  }
  final class run() extends Object() {
    <static> def main(args: Array[String]): Unit =
      try run() catch 
        {
          case error @ _:scala.util.CommandLineParser.ParseError =>
            scala.util.CommandLineParser.showError(error)
        }
  }
}

[[syntax trees at end of MegaPhase{crossVersionChecks, firstTransform, checkReentrant, elimPackagePrefixes, cookComments, checkLoopingImplicits, betaReduce, inlineVals, expandSAMs, elimRepeated, refchecks, dropForMap}]] // experiment.scala
package <empty> {
  @SourceFile("experiment.scala") @Child[(ButtonStyle.DarkMode : ButtonStyle)]
    @Child[(ButtonStyle.Secondary : ButtonStyle)] @Child[
    (ButtonStyle.Primary : ButtonStyle)] sealed abstract class ButtonStyle()
     extends Object(), scala.reflect.Enum {
    import ButtonStyle.{Primary, Secondary, DarkMode}
  }
  final lazy module val ButtonStyle: ButtonStyle = new ButtonStyle()
  @SourceFile("experiment.scala") final module class ButtonStyle() extends
    AnyRef(), scala.deriving.Mirror.Sum {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(classOf[ButtonStyle.type])
    case <static> val Primary: ButtonStyle = ButtonStyle.$new(0, "Primary")
    case <static> val Secondary: ButtonStyle = ButtonStyle.$new(1, "Secondary")
    case <static> val DarkMode: ButtonStyle = ButtonStyle.$new(2, "DarkMode")
    private[this] val $values: Array[ButtonStyle] =
      Array.apply[ButtonStyle](
        [this.Primary,this.Secondary,this.DarkMode : ButtonStyle])(using
        scala.reflect.ClassTag.apply[ButtonStyle](classOf[ButtonStyle]))
    def values: Array[ButtonStyle] = ButtonStyle.$values.clone()
    def valueOf($name: String): ButtonStyle =
      $name match 
        {
          case "Primary" => this.Primary
          case "Secondary" => this.Secondary
          case "DarkMode" => this.DarkMode
          case _ =>
            throw 
              new IllegalArgumentException(
                "enum ButtonStyle has no case with name: " + $name)
        }
    private[this] def $new(_$ordinal: Int, $name: String): ButtonStyle =
      {
        final class $anon() extends ButtonStyle(), scala.runtime.EnumValue, 
          scala.deriving.Mirror.Singleton {
          private def readResolve(): AnyRef =
            ButtonStyle.fromOrdinal(this.ordinal)
          override def productPrefix: String = $name
          override def toString(): String = $name
          override def ordinal: Int = _$ordinal
        }
        new 
          ButtonStyle with scala.runtime.EnumValue with 
            scala.deriving.Mirror.Singleton {...}
        ():(ButtonStyle & scala.runtime.EnumValue)
      }
    def fromOrdinal(ordinal: Int): ButtonStyle =
      try ButtonStyle.$values.apply(ordinal) catch 
        {
          case _ =>
            throw 
              new NoSuchElementException(
                "enum ButtonStyle has no case with ordinal: " +
                  ordinal.toString()
              )
        }
    type MirroredMonoType = ButtonStyle
    def ordinal(x$0: ButtonStyle.MirroredMonoType): Int = x$0.ordinal
  }
  final lazy module val Style: Style = new Style()
  @SourceFile("experiment.scala") final module class Style() extends Object() {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(classOf[Style.type])
    final def Primary: (ButtonStyle.Primary : ButtonStyle) = ButtonStyle.Primary
    final def DarkMode: (ButtonStyle.DarkMode : ButtonStyle) =
      ButtonStyle.DarkMode
    final def Secondary: (ButtonStyle.Secondary : ButtonStyle) =
      ButtonStyle.Secondary
  }
  @SourceFile("experiment.scala") case class Button(style: ButtonStyle) extends
    Object(), Product, Serializable {
    override def hashCode(): Int =
      scala.util.hashing.MurmurHash3.productHash(this, -70211317, true)
    override def equals(x$0: Any): Boolean =
      (this eq x$0.$asInstanceOf[Object]) ||
        (x$0 match 
          {
            case x$0 @ _:Button @unchecked =>
              this.style == x$0.style && x$0.canEqual(this)
            case _ => false
          }
        )
    override def toString(): String = scala.runtime.ScalaRunTime._toString(this)
    override def canEqual(that: Any): Boolean =
      that.isInstanceOf[Button @unchecked]
    override def productArity: Int = 1
    override def productPrefix: String = "Button"
    override def productElement(n: Int): Any =
      n match 
        {
          case 0 => this._1
          case _ => throw new IndexOutOfBoundsException(n.toString())
        }
    override def productElementName(n: Int): String =
      n match 
        {
          case 0 => "style"
          case _ => throw new IndexOutOfBoundsException(n.toString())
        }
    val style: ButtonStyle
    def copy(style: ButtonStyle): Button = new Button(style)
    def copy$default$1: ButtonStyle @uncheckedVariance = Button.this.style
    def _1: ButtonStyle = this.style
  }
  final lazy module val Button: Button = new Button()
  @SourceFile("experiment.scala") final module class Button() extends Object(), 
    scala.deriving.Mirror.Product {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(classOf[Button.type])
    def apply(style: ButtonStyle): Button = new Button(style)
    def unapply(x$1: Button): Button = x$1
    inline transparent def apply(inline style: StyleSelector): Button =
      {
        Button.apply(style.apply(Style))
      }
    type MirroredMonoType = Button
    def fromProduct(x$0: Product): Button.MirroredMonoType =
      {
        val style$1: ButtonStyle =
          x$0.productElement(0).$asInstanceOf[ButtonStyle]
        new Button(style$1)
      }
  }
  final lazy module val experiment$package: experiment$package =
    new experiment$package()
  @SourceFile("experiment.scala") final module class experiment$package()
     extends Object() {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(
        classOf[experiment$package.type])
    type StyleSelector = Style.type => ButtonStyle
    @main def run(): Unit =
      {
        val myButton: Button =
          Button.apply(
            {
              val _$1: Style = Style
              _$1.DarkMode
            }
          )
        println(myButton)
      }
  }
  @SourceFile("experiment.scala") final class run() extends Object() {
    <static> def main(args: Array[String]): Unit =
      try run() catch 
        {
          case error @ _:scala.util.CommandLineParser.ParseError =>
            scala.util.CommandLineParser.showError(error)
        }
  }
}

[[syntax trees at end of MegaPhase{pruneErasedDefs, uninitialized, inlinePatterns, vcInlineMethods, seqLiterals, intercepted, getters, specializeFunctions, specializeTuples, collectNullableFields, elimOuterSelect, resolveSuper, functionXXLForwarders, paramForwarding, genericTuples, letOverApply, arrayConstructors}]] // experiment.scala
package <empty> {
  @SourceFile("experiment.scala") @Child[(ButtonStyle.DarkMode : ButtonStyle)]
    @Child[(ButtonStyle.Secondary : ButtonStyle)] @Child[
    (ButtonStyle.Primary : ButtonStyle)] sealed abstract class ButtonStyle()
     extends Object(), scala.reflect.Enum {
    import ButtonStyle.{Primary, Secondary, DarkMode}
  }
  final lazy module val ButtonStyle: ButtonStyle = new ButtonStyle()
  @SourceFile("experiment.scala") final module class ButtonStyle() extends
    AnyRef(), scala.deriving.Mirror.Sum {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(classOf[ButtonStyle.type])
    case <static> val Primary: ButtonStyle = ButtonStyle.$new(0, "Primary")
    case <static> val Secondary: ButtonStyle = ButtonStyle.$new(1, "Secondary")
    case <static> val DarkMode: ButtonStyle = ButtonStyle.$new(2, "DarkMode")
    private val $values: Array[ButtonStyle] =
      Array.apply[ButtonStyle](
        scala.runtime.ScalaRunTime.wrapRefArray[ButtonStyle](
          [this.Primary,this.Secondary,this.DarkMode : ButtonStyle])
      )(using scala.reflect.ClassTag.apply[ButtonStyle](classOf[ButtonStyle]))
    def values: Array[ButtonStyle] = ButtonStyle.$values.clone()
    def valueOf($name: String): ButtonStyle =
      matchResult1[(ButtonStyle.Primary : ButtonStyle) |
        (ButtonStyle.Secondary : ButtonStyle) |
        (ButtonStyle.DarkMode : ButtonStyle)]: 
        {
          case val x1: ($name : String) = $name
          x1 match 
            {
              case "Primary" => return[matchResult1] this.Primary
              case "Secondary" => return[matchResult1] this.Secondary
              case "DarkMode" => return[matchResult1] this.DarkMode
              case _ =>
                throw 
                  new IllegalArgumentException(
                    "enum ButtonStyle has no case with name: " + $name)
            }
        }
    private def $new(_$ordinal: Int, $name: String): ButtonStyle =
      {
        final class $anon() extends ButtonStyle(), scala.runtime.EnumValue, 
          scala.deriving.Mirror.Singleton {
          private def readResolve(): AnyRef =
            ButtonStyle.fromOrdinal(this.ordinal)
          override def productPrefix: String = $name
          override def toString(): String = $name
          override def ordinal: Int = _$ordinal
        }
        new 
          ButtonStyle with scala.runtime.EnumValue with 
            scala.deriving.Mirror.Singleton {...}
        ():(ButtonStyle & scala.runtime.EnumValue)
      }
    def fromOrdinal(ordinal: Int): ButtonStyle =
      try ButtonStyle.$values.apply(ordinal) catch 
        {
          case _ =>
            throw 
              new NoSuchElementException(
                "enum ButtonStyle has no case with ordinal: " +
                  ordinal.toString()
              )
        }
    type MirroredMonoType = ButtonStyle
    def ordinal(x$0: ButtonStyle.MirroredMonoType): Int = x$0.ordinal
  }
  final lazy module val Style: Style = new Style()
  @SourceFile("experiment.scala") final module class Style() extends Object() {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(classOf[Style.type])
    final def Primary: (ButtonStyle.Primary : ButtonStyle) = ButtonStyle.Primary
    final def DarkMode: (ButtonStyle.DarkMode : ButtonStyle) =
      ButtonStyle.DarkMode
    final def Secondary: (ButtonStyle.Secondary : ButtonStyle) =
      ButtonStyle.Secondary
  }
  @SourceFile("experiment.scala") case class Button(style: ButtonStyle) extends
    Object(), Product, Serializable {
    override def hashCode(): Int =
      scala.util.hashing.MurmurHash3.productHash(this, -70211317, true)
    override def equals(x$0: Any): Boolean =
      (this eq x$0.$asInstanceOf[Object]) ||
        (matchResult2[Boolean]: 
          {
            case val x2: (x$0 : Any) = x$0
            if x2.$isInstanceOf[Button @unchecked] then
              {
                case val x$0: Button = x2.$asInstanceOf[Button @unchecked]
                return[matchResult2]
                  this.style == x$0.style && x$0.canEqual(this)
              }
             else ()
            return[matchResult2] false
          }
        )
    override def toString(): String = scala.runtime.ScalaRunTime._toString(this)
    override def canEqual(that: Any): Boolean =
      that.isInstanceOf[Button @unchecked]
    override def productArity: Int = 1
    override def productPrefix: String = "Button"
    override def productElement(n: Int): Any =
      matchResult3[ButtonStyle]: 
        {
          case val x4: (n : Int) = n
          if 0 == x4 then return[matchResult3] this._1 else ()
          throw new IndexOutOfBoundsException(n.toString())
        }
    override def productElementName(n: Int): String =
      matchResult4[("style" : String)]: 
        {
          case val x5: (n : Int) = n
          if 0 == x5 then return[matchResult4] "style" else ()
          throw new IndexOutOfBoundsException(n.toString())
        }
    def style: ButtonStyle
    def copy(style: ButtonStyle): Button = new Button(style)
    def copy$default$1: ButtonStyle @uncheckedVariance = Button.this.style
    def _1: ButtonStyle = this.style
  }
  final lazy module val Button: Button = new Button()
  @SourceFile("experiment.scala") final module class Button() extends Object(), 
    scala.deriving.Mirror.Product {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(classOf[Button.type])
    def apply(style: ButtonStyle): Button = new Button(style)
    def unapply(x$1: Button): Button = x$1
    private inline transparent def apply(inline style: StyleSelector): Button =
      scala.compiletime.erasedValue[Button]
    type MirroredMonoType = Button
    def fromProduct(x$0: Product): Button.MirroredMonoType =
      {
        val style$1: ButtonStyle =
          x$0.productElement(0).$asInstanceOf[ButtonStyle]
        new Button(style$1)
      }
  }
  final lazy module val experiment$package: experiment$package =
    new experiment$package()
  @SourceFile("experiment.scala") final module class experiment$package()
     extends Object() {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(
        classOf[experiment$package.type])
    type StyleSelector = Style.type => ButtonStyle
    @main def run(): Unit =
      {
        val myButton: Button =
          Button.apply(
            {
              val _$1: Style = Style
              _$1.DarkMode
            }
          )
        println(myButton)
      }
  }
  @SourceFile("experiment.scala") final class run() extends Object() {
    <static> def main(args: Array[String]): Unit =
      try run() catch 
        {
          case error @ _:scala.util.CommandLineParser.ParseError =>
            scala.util.CommandLineParser.showError(error)
        }
  }
}
```

## Explain

## Key Evidence of Success ✅

### 1. Lambda Elimination

In your `@main def run()`, the lambda `_.DarkMode` has been completely eliminated:

```scala
val myButton: Button =
  Button.apply(
    style =
      {
        val _$1: Style = Style
        _$1.DarkMode
      }
  )
```

This is NOT a lambda anymore - it's direct member access! The `_$1` is just a temporary variable the compiler uses internally, equivalent to `Style.DarkMode`.

### 2. No Function Call Overhead

There's no `style.apply(Style)` function call in the final code. The compiler evaluated it at compile time and replaced it with the direct result.

### 3. Inline Method Erasure

Notice in the later compilation phase:

```scala
scalaprivate inline transparent def apply(inline style: StyleSelector): Button =
  scala.compiletime.erasedValue[Button]
```

The inline method body is erased because it's only used at compile time! This confirms the inlining worked.

### What You Achieved

Before (runtime cost):

Lambda allocation: `x => x.DarkMode`
Function call: `style.apply(Style)`

After (compile time):

Direct access: `Style.DarkMode`
Zero runtime overhead

Your transparent inline approach successfully forced compile-time evaluation. The bytecode will contain no lambda or function call - just a direct reference to the DarkMode field. Perfect! 🎉