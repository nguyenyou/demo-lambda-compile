

```scala 3
[[syntax trees at end of          inlinedPositions]] // advanced.scala
package advanced {
  case class Button(style: advanced.Button.ButtonStyle) extends Object(),
    _root_.scala.Product, _root_.scala.Serializable {
    val style: advanced.Button.ButtonStyle
    def copy(style: advanced.Button.ButtonStyle): advanced.Button =
      new advanced.Button(style)
    def copy$default$1: advanced.Button.ButtonStyle @uncheckedVariance =
      Button.this.style
    def _1: advanced.Button.ButtonStyle = this.style
  }
  final lazy module val Button: advanced.Button = new advanced.Button()
  final module class Button() extends Object() { this: advanced.Button.type =>
    def apply(style: advanced.Button.ButtonStyle): advanced.Button =
      new advanced.Button(style)
    def unapply(x$1: advanced.Button): advanced.Button = x$1
    private[this] inline def defaultStyle: advanced.Button.StyleSelector =
      (_$1: advanced.Button.Style.type) =>
        _$1.Primary.apply(color = (_$2: advanced.Button.Color.type) => _$2.Green
          )
      :advanced.Button.StyleSelector
    inline transparent def apply(inline style: advanced.Button.StyleSelector):
      advanced.Button =
      {
        advanced.Button.apply(style = style.apply(advanced.Button.Style))
      }
    inline def apply$default$1: advanced.Button.StyleSelector =
      advanced.Button.defaultStyle:advanced.Button.StyleSelector
    @Child[advanced.Button.Color.Blue.type]
      @Child[advanced.Button.Color.Green.type] @Child[
      advanced.Button.Color.Red.type] sealed trait Color() extends Object {}
    final lazy module val Color: advanced.Button.Color =
      new advanced.Button.Color()
    final module class Color() extends Object() {
      this: advanced.Button.Color.type =>
      final lazy module case val Red: advanced.Button.Color.Red =
        new advanced.Button.Color.Red()
      final module case class Red() extends Object(), advanced.Button.Color,
        _root_.scala.Product, _root_.scala.Serializable {
        this: advanced.Button.Color.Red.type =>}
      final lazy module case val Green: advanced.Button.Color.Green =
        new advanced.Button.Color.Green()
      final module case class Green() extends Object(), advanced.Button.Color,
        _root_.scala.Product, _root_.scala.Serializable {
        this: advanced.Button.Color.Green.type =>}
      final lazy module case val Blue: advanced.Button.Color.Blue =
        new advanced.Button.Color.Blue()
      final module case class Blue() extends Object(), advanced.Button.Color,
        _root_.scala.Product, _root_.scala.Serializable {
        this: advanced.Button.Color.Blue.type =>}
    }
    @Child[advanced.Button.Style.Secondary] @Child[advanced.Button.Style.Primary
      ] sealed trait ButtonStyle() extends Object {}
    final lazy module val Style: advanced.Button.Style =
      new advanced.Button.Style()
    final module class Style() extends Object() {
      this: advanced.Button.Style.type =>
      case class Primary(color: advanced.Button.Color) extends Object(),
        advanced.Button.ButtonStyle, _root_.scala.Product, _root_.scala.
        Serializable {
        val color: advanced.Button.Color
        def copy(color: advanced.Button.Color): advanced.Button.Style.Primary =
          new advanced.Button.Style.Primary(color)
        def copy$default$1: advanced.Button.Color @uncheckedVariance =
          Primary.this.color
        def _1: advanced.Button.Color = this.color
      }
      final lazy module val Primary: advanced.Button.Style.Primary =
        new advanced.Button.Style.Primary()
      final module class Primary() extends Object() {
        this: advanced.Button.Style.Primary.type =>
        def apply(color: advanced.Button.Color): advanced.Button.Style.Primary
           = new advanced.Button.Style.Primary(color)
        def unapply(x$1: advanced.Button.Style.Primary):
          advanced.Button.Style.Primary = x$1
        private[this] inline def defaultColor: advanced.Button.ColorSelector =
          (_$3: advanced.Button.Color.type) => _$3.Red:
            advanced.Button.ColorSelector
        inline transparent def apply(inline color: advanced.Button.ColorSelector
          ): advanced.Button.Style.Primary =
          {
            advanced.Button.Style.Primary.apply(
              color = color.apply(advanced.Button.Color))
          }
        inline def apply$default$1: advanced.Button.ColorSelector =
          advanced.Button.Style.Primary.defaultColor:
            advanced.Button.ColorSelector
      }
      case class Secondary(color: advanced.Button.Color) extends Object(),
        advanced.Button.ButtonStyle, _root_.scala.Product, _root_.scala.
        Serializable {
        val color: advanced.Button.Color
        def copy(color: advanced.Button.Color): advanced.Button.Style.Secondary
           = new advanced.Button.Style.Secondary(color)
        def copy$default$1: advanced.Button.Color @uncheckedVariance =
          Secondary.this.color
        def _1: advanced.Button.Color = this.color
      }
      final lazy module val Secondary: advanced.Button.Style.Secondary =
        new advanced.Button.Style.Secondary()
      final module class Secondary() extends AnyRef() {
        this: advanced.Button.Style.Secondary.type =>
        def apply(color: advanced.Button.Color): advanced.Button.Style.Secondary
           = new advanced.Button.Style.Secondary(color)
        def unapply(x$1: advanced.Button.Style.Secondary):
          advanced.Button.Style.Secondary = x$1
        override def toString: String = "Secondary"
      }
    }
    type StyleSelector =
      advanced.Button.Style.type => advanced.Button.ButtonStyle
    type ColorSelector = advanced.Button.Color.type => advanced.Button.Color
  }
  final lazy module val advanced$package: advanced.advanced$package =
    new advanced.advanced$package()
  final module class advanced$package() extends Object() {
    this: advanced.advanced$package.type =>
    @main def run(): Unit =
      {
        val myButton: advanced.Button =
          advanced.Button.apply(
            style =
              {
                val _$4: advanced.Button.Style = advanced.Button.Style
                advanced.Button.Style.Primary.apply(
                  color =
                    {
                      val _$5: advanced.Button.Color = advanced.Button.Color
                      _$5.Blue
                    }
                )
              }
          )
        val defaultButton: advanced.Button =
          advanced.Button.apply(
            style = advanced.Button.apply$default$1.apply(advanced.Button.Style)
            )
        println(myButton)
        println(defaultButton)
      }
  }
  final class run() extends Object() {
    <static> def main(args: Array[String]): Unit =
      try advanced.run() catch 
        {
          case error @ _:scala.util.CommandLineParser.ParseError =>
            scala.util.CommandLineParser.showError(error)
        }
  }
}

[[syntax trees at end of MegaPhase{crossVersionChecks, firstTransform, checkReentrant, elimPackagePrefixes, cookComments, checkLoopingImplicits, betaReduce, inlineVals, expandSAMs, elimRepeated, refchecks, dropForMap}]] // advanced.scala
package advanced {
  @SourceFile("advanced.scala") case class Button(
    style: advanced.Button.ButtonStyle) extends Object(), Product, Serializable
     {
    override def hashCode(): Int =
      scala.util.hashing.MurmurHash3.productHash(this, -70211317, true)
    override def equals(x$0: Any): Boolean =
      (this eq x$0.$asInstanceOf[Object]) ||
        (x$0 match 
          {
            case x$0 @ _:advanced.Button @unchecked =>
              this.style == x$0.style && x$0.canEqual(this)
            case _ => false
          }
        )
    override def toString(): String = scala.runtime.ScalaRunTime._toString(this)
    override def canEqual(that: Any): Boolean =
      that.isInstanceOf[advanced.Button @unchecked]
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
    val style: advanced.Button.ButtonStyle
    def copy(style: advanced.Button.ButtonStyle): advanced.Button =
      new advanced.Button(style)
    def copy$default$1: advanced.Button.ButtonStyle @uncheckedVariance =
      Button.this.style
    def _1: advanced.Button.ButtonStyle = this.style
  }
  final lazy module val Button: advanced.Button = new advanced.Button()
  @SourceFile("advanced.scala") final module class Button() extends Object(), 
    scala.deriving.Mirror.Product {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(classOf[advanced.Button.type])
    def apply(style: advanced.Button.ButtonStyle): advanced.Button =
      new advanced.Button(style)
    def unapply(x$1: advanced.Button): advanced.Button = x$1
    private[this] inline def defaultStyle: advanced.Button.StyleSelector =
      (_$1: advanced.Button.Style.type) =>
        _$1.Primary.apply((_$2: advanced.Button.Color.type) => _$2.Green):
        advanced.Button.StyleSelector
    inline transparent def apply(inline style: advanced.Button.StyleSelector):
      advanced.Button =
      {
        advanced.Button.apply(style.apply(advanced.Button.Style))
      }
    inline def apply$default$1: advanced.Button.StyleSelector =
      advanced.Button.defaultStyle:advanced.Button.StyleSelector
    @Child[advanced.Button.Color.Blue.type]
      @Child[advanced.Button.Color.Green.type] @Child[
      advanced.Button.Color.Red.type] sealed trait Color() extends Object {}
    final lazy module val Color: advanced.Button.Color =
      new advanced.Button.Color()
    final module class Color() extends Object(), scala.deriving.Mirror.Sum {
      private def writeReplace(): AnyRef =
        new scala.runtime.ModuleSerializationProxy(
          classOf[advanced.Button.Color.type])
      final lazy module case val Red: advanced.Button.Color.Red =
        new advanced.Button.Color.Red()
      final module case class Red() extends Object(), advanced.Button.Color,
        Product, Serializable, scala.deriving.Mirror.Singleton {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Color.Red.type])
        override def hashCode(): Int = 82033
        override def toString(): String = "Red"
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Color.Red @unchecked]
        override def productArity: Int = 0
        override def productPrefix: String = "Red"
        override def productElement(n: Int): Any =
          n match 
            {
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          n match 
            {
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
      }
      final lazy module case val Green: advanced.Button.Color.Green =
        new advanced.Button.Color.Green()
      final module case class Green() extends Object(), advanced.Button.Color,
        Product, Serializable, scala.deriving.Mirror.Singleton {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Color.Green.type])
        override def hashCode(): Int = 69066467
        override def toString(): String = "Green"
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Color.Green @unchecked]
        override def productArity: Int = 0
        override def productPrefix: String = "Green"
        override def productElement(n: Int): Any =
          n match 
            {
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          n match 
            {
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
      }
      final lazy module case val Blue: advanced.Button.Color.Blue =
        new advanced.Button.Color.Blue()
      final module case class Blue() extends Object(), advanced.Button.Color,
        Product, Serializable, scala.deriving.Mirror.Singleton {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Color.Blue.type])
        override def hashCode(): Int = 2073722
        override def toString(): String = "Blue"
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Color.Blue @unchecked]
        override def productArity: Int = 0
        override def productPrefix: String = "Blue"
        override def productElement(n: Int): Any =
          n match 
            {
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          n match 
            {
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
      }
      type MirroredMonoType = advanced.Button.Color
      def ordinal(x$0: advanced.Button.Color.MirroredMonoType): Int =
        x$0:(x$0 : advanced.Button.Color.MirroredMonoType) @unchecked match 
          {
            case _:advanced.Button.Color.Red.type => 0
            case _:advanced.Button.Color.Green.type => 1
            case _:advanced.Button.Color.Blue.type => 2
          }
    }
    @Child[advanced.Button.Style.Secondary] @Child[advanced.Button.Style.Primary
      ] sealed trait ButtonStyle() extends Object {}
    final lazy module val Style: advanced.Button.Style =
      new advanced.Button.Style()
    final module class Style() extends Object() {
      private def writeReplace(): AnyRef =
        new scala.runtime.ModuleSerializationProxy(
          classOf[advanced.Button.Style.type])
      case class Primary(color: advanced.Button.Color) extends Object(),
        advanced.Button.ButtonStyle, Product, Serializable {
        override def hashCode(): Int =
          scala.util.hashing.MurmurHash3.productHash(this, 1561781815, true)
        override def equals(x$0: Any): Boolean =
          (this eq x$0.$asInstanceOf[Object]) ||
            (x$0 match 
              {
                case x$0 @ _:advanced.Button.Style.Primary @unchecked =>
                  this.color == x$0.color && x$0.canEqual(this)
                case _ => false
              }
            )
        override def toString(): String =
          scala.runtime.ScalaRunTime._toString(this)
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Style.Primary @unchecked]
        override def productArity: Int = 1
        override def productPrefix: String = "Primary"
        override def productElement(n: Int): Any =
          n match 
            {
              case 0 => this._1
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          n match 
            {
              case 0 => "color"
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
        val color: advanced.Button.Color
        def copy(color: advanced.Button.Color): advanced.Button.Style.Primary =
          new advanced.Button.Style.Primary(color)
        def copy$default$1: advanced.Button.Color @uncheckedVariance =
          Primary.this.color
        def _1: advanced.Button.Color = this.color
      }
      final lazy module val Primary: advanced.Button.Style.Primary =
        new advanced.Button.Style.Primary()
      final module class Primary() extends Object(), 
        scala.deriving.Mirror.Product {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Style.Primary.type])
        def apply(color: advanced.Button.Color): advanced.Button.Style.Primary
           = new advanced.Button.Style.Primary(color)
        def unapply(x$1: advanced.Button.Style.Primary):
          advanced.Button.Style.Primary = x$1
        private[this] inline def defaultColor: advanced.Button.ColorSelector =
          (_$3: advanced.Button.Color.type) => _$3.Red:
            advanced.Button.ColorSelector
        inline transparent def apply(inline color: advanced.Button.ColorSelector
          ): advanced.Button.Style.Primary =
          {
            advanced.Button.Style.Primary.apply(
              color.apply(advanced.Button.Color))
          }
        inline def apply$default$1: advanced.Button.ColorSelector =
          advanced.Button.Style.Primary.defaultColor:
            advanced.Button.ColorSelector
        type MirroredMonoType = advanced.Button.Style.Primary
        def fromProduct(x$0: Product):
          advanced.Button.Style.Primary.MirroredMonoType =
          {
            val color$1: advanced.Button.Color =
              x$0.productElement(0).$asInstanceOf[advanced.Button.Color]
            new advanced.Button.Style.Primary(color$1)
          }
      }
      case class Secondary(color: advanced.Button.Color) extends Object(),
        advanced.Button.ButtonStyle, Product, Serializable {
        override def hashCode(): Int =
          scala.util.hashing.MurmurHash3.productHash(this, 955988779, true)
        override def equals(x$0: Any): Boolean =
          (this eq x$0.$asInstanceOf[Object]) ||
            (x$0 match 
              {
                case x$0 @ _:advanced.Button.Style.Secondary @unchecked =>
                  this.color == x$0.color && x$0.canEqual(this)
                case _ => false
              }
            )
        override def toString(): String =
          scala.runtime.ScalaRunTime._toString(this)
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Style.Secondary @unchecked]
        override def productArity: Int = 1
        override def productPrefix: String = "Secondary"
        override def productElement(n: Int): Any =
          n match 
            {
              case 0 => this._1
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          n match 
            {
              case 0 => "color"
              case _ => throw new IndexOutOfBoundsException(n.toString())
            }
        val color: advanced.Button.Color
        def copy(color: advanced.Button.Color): advanced.Button.Style.Secondary
           = new advanced.Button.Style.Secondary(color)
        def copy$default$1: advanced.Button.Color @uncheckedVariance =
          Secondary.this.color
        def _1: advanced.Button.Color = this.color
      }
      final lazy module val Secondary: advanced.Button.Style.Secondary =
        new advanced.Button.Style.Secondary()
      final module class Secondary() extends AnyRef(), 
        scala.deriving.Mirror.Product {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Style.Secondary.type])
        def apply(color: advanced.Button.Color): advanced.Button.Style.Secondary
           = new advanced.Button.Style.Secondary(color)
        def unapply(x$1: advanced.Button.Style.Secondary):
          advanced.Button.Style.Secondary = x$1
        override def toString: String = "Secondary"
        type MirroredMonoType = advanced.Button.Style.Secondary
        def fromProduct(x$0: Product):
          advanced.Button.Style.Secondary.MirroredMonoType =
          {
            val color$2: advanced.Button.Color =
              x$0.productElement(0).$asInstanceOf[advanced.Button.Color]
            new advanced.Button.Style.Secondary(color$2)
          }
      }
    }
    type StyleSelector =
      advanced.Button.Style.type => advanced.Button.ButtonStyle
    type ColorSelector = advanced.Button.Color.type => advanced.Button.Color
    type MirroredMonoType = advanced.Button
    def fromProduct(x$0: Product): advanced.Button.MirroredMonoType =
      {
        val style$1: advanced.Button.ButtonStyle =
          x$0.productElement(0).$asInstanceOf[advanced.Button.ButtonStyle]
        new advanced.Button(style$1)
      }
  }
  final lazy module val advanced$package: advanced.advanced$package =
    new advanced.advanced$package()
  @SourceFile("advanced.scala") final module class advanced$package() extends
    Object() {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(
        classOf[advanced.advanced$package.type])
    @main def run(): Unit =
      {
        val myButton: advanced.Button =
          advanced.Button.apply(
            {
              val _$4: advanced.Button.Style = advanced.Button.Style
              advanced.Button.Style.Primary.apply(
                {
                  val _$5: advanced.Button.Color = advanced.Button.Color
                  _$5.Blue
                }
              )
            }
          )
        val defaultButton: advanced.Button =
          advanced.Button.apply(
            {
              val _$1: advanced.Button.Style = advanced.Button.Style
              advanced.Button.Style.Primary.apply(
                {
                  val _$2: advanced.Button.Color = advanced.Button.Color
                  _$2.Green
                }
              )
            }
          )
        println(myButton)
        println(defaultButton)
      }
  }
  @SourceFile("advanced.scala") final class run() extends Object() {
    <static> def main(args: Array[String]): Unit =
      try advanced.run() catch 
        {
          case error @ _:scala.util.CommandLineParser.ParseError =>
            scala.util.CommandLineParser.showError(error)
        }
  }
}

[[syntax trees at end of MegaPhase{pruneErasedDefs, uninitialized, inlinePatterns, vcInlineMethods, seqLiterals, intercepted, getters, specializeFunctions, specializeTuples, collectNullableFields, elimOuterSelect, resolveSuper, functionXXLForwarders, paramForwarding, genericTuples, letOverApply, arrayConstructors}]] // advanced.scala
package advanced {
  @SourceFile("advanced.scala") case class Button(
    style: advanced.Button.ButtonStyle) extends Object(), Product, Serializable
     {
    override def hashCode(): Int =
      scala.util.hashing.MurmurHash3.productHash(this, -70211317, true)
    override def equals(x$0: Any): Boolean =
      (this eq x$0.$asInstanceOf[Object]) ||
        (matchResult1[Boolean]: 
          {
            case val x1: (x$0 : Any) = x$0
            if x1.$isInstanceOf[advanced.Button @unchecked] then
              {
                case val x$0: advanced.Button =
                  x1.$asInstanceOf[advanced.Button @unchecked]
                return[matchResult1]
                  this.style == x$0.style && x$0.canEqual(this)
              }
             else ()
            return[matchResult1] false
          }
        )
    override def toString(): String = scala.runtime.ScalaRunTime._toString(this)
    override def canEqual(that: Any): Boolean =
      that.isInstanceOf[advanced.Button @unchecked]
    override def productArity: Int = 1
    override def productPrefix: String = "Button"
    override def productElement(n: Int): Any =
      matchResult2[advanced.Button.ButtonStyle]: 
        {
          case val x3: (n : Int) = n
          if 0 == x3 then return[matchResult2] this._1 else ()
          throw new IndexOutOfBoundsException(n.toString())
        }
    override def productElementName(n: Int): String =
      matchResult3[("style" : String)]: 
        {
          case val x4: (n : Int) = n
          if 0 == x4 then return[matchResult3] "style" else ()
          throw new IndexOutOfBoundsException(n.toString())
        }
    def style: advanced.Button.ButtonStyle
    def copy(style: advanced.Button.ButtonStyle): advanced.Button =
      new advanced.Button(style)
    def copy$default$1: advanced.Button.ButtonStyle @uncheckedVariance =
      Button.this.style
    def _1: advanced.Button.ButtonStyle = this.style
  }
  final lazy module val Button: advanced.Button = new advanced.Button()
  @SourceFile("advanced.scala") final module class Button() extends Object(), 
    scala.deriving.Mirror.Product {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(classOf[advanced.Button.type])
    def apply(style: advanced.Button.ButtonStyle): advanced.Button =
      new advanced.Button(style)
    def unapply(x$1: advanced.Button): advanced.Button = x$1
    private inline def defaultStyle: advanced.Button.StyleSelector =
      scala.compiletime.erasedValue[advanced.Button.StyleSelector]
    private inline transparent def apply(
      inline style: advanced.Button.StyleSelector): advanced.Button =
      scala.compiletime.erasedValue[advanced.Button]
    private inline def apply$default$1: advanced.Button.StyleSelector =
      scala.compiletime.erasedValue[advanced.Button.StyleSelector]
    @Child[advanced.Button.Color.Blue.type]
      @Child[advanced.Button.Color.Green.type] @Child[
      advanced.Button.Color.Red.type] sealed trait Color() extends Object {}
    final lazy module val Color: advanced.Button.Color =
      new advanced.Button.Color()
    final module class Color() extends Object(), scala.deriving.Mirror.Sum {
      private def writeReplace(): AnyRef =
        new scala.runtime.ModuleSerializationProxy(
          classOf[advanced.Button.Color.type])
      final lazy module case val Red: advanced.Button.Color.Red =
        new advanced.Button.Color.Red()
      final module case class Red() extends Object(), advanced.Button.Color,
        Product, Serializable, scala.deriving.Mirror.Singleton {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Color.Red.type])
        override def hashCode(): Int = 82033
        override def toString(): String = "Red"
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Color.Red @unchecked]
        override def productArity: Int = 0
        override def productPrefix: String = "Red"
        override def productElement(n: Int): Any =
          matchResult4[Nothing]: 
            {
              case val x5: (n : Int) = n
              throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          matchResult5[Nothing]: 
            {
              case val x6: (n : Int) = n
              throw new IndexOutOfBoundsException(n.toString())
            }
      }
      final lazy module case val Green: advanced.Button.Color.Green =
        new advanced.Button.Color.Green()
      final module case class Green() extends Object(), advanced.Button.Color,
        Product, Serializable, scala.deriving.Mirror.Singleton {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Color.Green.type])
        override def hashCode(): Int = 69066467
        override def toString(): String = "Green"
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Color.Green @unchecked]
        override def productArity: Int = 0
        override def productPrefix: String = "Green"
        override def productElement(n: Int): Any =
          matchResult6[Nothing]: 
            {
              case val x7: (n : Int) = n
              throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          matchResult7[Nothing]: 
            {
              case val x8: (n : Int) = n
              throw new IndexOutOfBoundsException(n.toString())
            }
      }
      final lazy module case val Blue: advanced.Button.Color.Blue =
        new advanced.Button.Color.Blue()
      final module case class Blue() extends Object(), advanced.Button.Color,
        Product, Serializable, scala.deriving.Mirror.Singleton {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Color.Blue.type])
        override def hashCode(): Int = 2073722
        override def toString(): String = "Blue"
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Color.Blue @unchecked]
        override def productArity: Int = 0
        override def productPrefix: String = "Blue"
        override def productElement(n: Int): Any =
          matchResult8[Nothing]: 
            {
              case val x9: (n : Int) = n
              throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          matchResult9[Nothing]: 
            {
              case val x10: (n : Int) = n
              throw new IndexOutOfBoundsException(n.toString())
            }
      }
      type MirroredMonoType = advanced.Button.Color
      def ordinal(x$0: advanced.Button.Color.MirroredMonoType): Int =
        matchResult10[(0 : Int) | (1 : Int) | (2 : Int)]: 
          {
            case val x11:
              (x$0 : advanced.Button.Color.MirroredMonoType) @unchecked =
              x$0:(x$0 : advanced.Button.Color.MirroredMonoType) @unchecked
            if x11 eq advanced.Button.Color.Red then return[matchResult10] 0
               else ()
            if x11 eq advanced.Button.Color.Green then return[matchResult10] 1
               else ()
            if x11 eq advanced.Button.Color.Blue then return[matchResult10] 2
               else ()
            throw new MatchError(x11)
          }
    }
    @Child[advanced.Button.Style.Secondary] @Child[advanced.Button.Style.Primary
      ] sealed trait ButtonStyle() extends Object {}
    final lazy module val Style: advanced.Button.Style =
      new advanced.Button.Style()
    final module class Style() extends Object() {
      private def writeReplace(): AnyRef =
        new scala.runtime.ModuleSerializationProxy(
          classOf[advanced.Button.Style.type])
      case class Primary(color: advanced.Button.Color) extends Object(),
        advanced.Button.ButtonStyle, Product, Serializable {
        override def hashCode(): Int =
          scala.util.hashing.MurmurHash3.productHash(this, 1561781815, true)
        override def equals(x$0: Any): Boolean =
          (this eq x$0.$asInstanceOf[Object]) ||
            (matchResult11[Boolean]: 
              {
                case val x15: (x$0 : Any) = x$0
                if x15.$isInstanceOf[advanced.Button.Style.Primary @unchecked]
                   then
                  {
                    case val x$0: advanced.Button.Style.Primary =
                      x15.$asInstanceOf[advanced.Button.Style.Primary @unchecked
                        ]
                    return[matchResult11]
                      this.color == x$0.color && x$0.canEqual(this)
                  }
                 else ()
                return[matchResult11] false
              }
            )
        override def toString(): String =
          scala.runtime.ScalaRunTime._toString(this)
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Style.Primary @unchecked]
        override def productArity: Int = 1
        override def productPrefix: String = "Primary"
        override def productElement(n: Int): Any =
          matchResult12[advanced.Button.Color]: 
            {
              case val x17: (n : Int) = n
              if 0 == x17 then return[matchResult12] this._1 else ()
              throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          matchResult13[("color" : String)]: 
            {
              case val x18: (n : Int) = n
              if 0 == x18 then return[matchResult13] "color" else ()
              throw new IndexOutOfBoundsException(n.toString())
            }
        def color: advanced.Button.Color
        def copy(color: advanced.Button.Color): advanced.Button.Style.Primary =
          new advanced.Button.Style.Primary(color)
        def copy$default$1: advanced.Button.Color @uncheckedVariance =
          Primary.this.color
        def _1: advanced.Button.Color = this.color
      }
      final lazy module val Primary: advanced.Button.Style.Primary =
        new advanced.Button.Style.Primary()
      final module class Primary() extends Object(), 
        scala.deriving.Mirror.Product {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Style.Primary.type])
        def apply(color: advanced.Button.Color): advanced.Button.Style.Primary
           = new advanced.Button.Style.Primary(color)
        def unapply(x$1: advanced.Button.Style.Primary):
          advanced.Button.Style.Primary = x$1
        private inline def defaultColor: advanced.Button.ColorSelector =
          scala.compiletime.erasedValue[advanced.Button.ColorSelector]
        private inline transparent def apply(
          inline color: advanced.Button.ColorSelector):
          advanced.Button.Style.Primary =
          scala.compiletime.erasedValue[advanced.Button.Style.Primary]
        private inline def apply$default$1: advanced.Button.ColorSelector =
          scala.compiletime.erasedValue[advanced.Button.ColorSelector]
        type MirroredMonoType = advanced.Button.Style.Primary
        def fromProduct(x$0: Product):
          advanced.Button.Style.Primary.MirroredMonoType =
          {
            val color$1: advanced.Button.Color =
              x$0.productElement(0).$asInstanceOf[advanced.Button.Color]
            new advanced.Button.Style.Primary(color$1)
          }
      }
      case class Secondary(color: advanced.Button.Color) extends Object(),
        advanced.Button.ButtonStyle, Product, Serializable {
        override def hashCode(): Int =
          scala.util.hashing.MurmurHash3.productHash(this, 955988779, true)
        override def equals(x$0: Any): Boolean =
          (this eq x$0.$asInstanceOf[Object]) ||
            (matchResult14[Boolean]: 
              {
                case val x19: (x$0 : Any) = x$0
                if x19.$isInstanceOf[advanced.Button.Style.Secondary @unchecked]
                   then
                  {
                    case val x$0: advanced.Button.Style.Secondary =
                      x19.$asInstanceOf[
                        advanced.Button.Style.Secondary @unchecked]
                    return[matchResult14]
                      this.color == x$0.color && x$0.canEqual(this)
                  }
                 else ()
                return[matchResult14] false
              }
            )
        override def toString(): String =
          scala.runtime.ScalaRunTime._toString(this)
        override def canEqual(that: Any): Boolean =
          that.isInstanceOf[advanced.Button.Style.Secondary @unchecked]
        override def productArity: Int = 1
        override def productPrefix: String = "Secondary"
        override def productElement(n: Int): Any =
          matchResult15[advanced.Button.Color]: 
            {
              case val x21: (n : Int) = n
              if 0 == x21 then return[matchResult15] this._1 else ()
              throw new IndexOutOfBoundsException(n.toString())
            }
        override def productElementName(n: Int): String =
          matchResult16[("color" : String)]: 
            {
              case val x22: (n : Int) = n
              if 0 == x22 then return[matchResult16] "color" else ()
              throw new IndexOutOfBoundsException(n.toString())
            }
        def color: advanced.Button.Color
        def copy(color: advanced.Button.Color): advanced.Button.Style.Secondary
           = new advanced.Button.Style.Secondary(color)
        def copy$default$1: advanced.Button.Color @uncheckedVariance =
          Secondary.this.color
        def _1: advanced.Button.Color = this.color
      }
      final lazy module val Secondary: advanced.Button.Style.Secondary =
        new advanced.Button.Style.Secondary()
      final module class Secondary() extends AnyRef(), 
        scala.deriving.Mirror.Product {
        private def writeReplace(): AnyRef =
          new scala.runtime.ModuleSerializationProxy(
            classOf[advanced.Button.Style.Secondary.type])
        def apply(color: advanced.Button.Color): advanced.Button.Style.Secondary
           = new advanced.Button.Style.Secondary(color)
        def unapply(x$1: advanced.Button.Style.Secondary):
          advanced.Button.Style.Secondary = x$1
        override def toString: String = "Secondary"
        type MirroredMonoType = advanced.Button.Style.Secondary
        def fromProduct(x$0: Product):
          advanced.Button.Style.Secondary.MirroredMonoType =
          {
            val color$2: advanced.Button.Color =
              x$0.productElement(0).$asInstanceOf[advanced.Button.Color]
            new advanced.Button.Style.Secondary(color$2)
          }
      }
    }
    type StyleSelector =
      advanced.Button.Style.type => advanced.Button.ButtonStyle
    type ColorSelector = advanced.Button.Color.type => advanced.Button.Color
    type MirroredMonoType = advanced.Button
    def fromProduct(x$0: Product): advanced.Button.MirroredMonoType =
      {
        val style$1: advanced.Button.ButtonStyle =
          x$0.productElement(0).$asInstanceOf[advanced.Button.ButtonStyle]
        new advanced.Button(style$1)
      }
  }
  final lazy module val advanced$package: advanced.advanced$package =
    new advanced.advanced$package()
  @SourceFile("advanced.scala") final module class advanced$package() extends
    Object() {
    private def writeReplace(): AnyRef =
      new scala.runtime.ModuleSerializationProxy(
        classOf[advanced.advanced$package.type])
    @main def run(): Unit =
      {
        val myButton: advanced.Button =
          advanced.Button.apply(
            {
              val _$4: advanced.Button.Style = advanced.Button.Style
              advanced.Button.Style.Primary.apply(
                {
                  val _$5: advanced.Button.Color = advanced.Button.Color
                  _$5.Blue
                }
              )
            }
          )
        val defaultButton: advanced.Button =
          advanced.Button.apply(
            {
              val _$1: advanced.Button.Style = advanced.Button.Style
              advanced.Button.Style.Primary.apply(
                {
                  val _$2: advanced.Button.Color = advanced.Button.Color
                  _$2.Green
                }
              )
            }
          )
        println(myButton)
        println(defaultButton)
      }
  }
  @SourceFile("advanced.scala") final class run() extends Object() {
    <static> def main(args: Array[String]): Unit =
      try advanced.run() catch 
        {
          case error @ _:scala.util.CommandLineParser.ParseError =>
            scala.util.CommandLineParser.showError(error)
        }
  }
}
```

Yes, this is working perfectly! Both cases are fully evaluated at compile time with complete lambda elimination.

Analysis

## 1. Explicit Selector (myButton)

```scala 3
val myButton: advanced.Button =
  advanced.Button.apply(
    {
      val _$4: advanced.Button.Style = advanced.Button.Style
      advanced.Button.Style.Primary.apply(
        {
          val _$5: advanced.Button.Color = advanced.Button.Color
          _$5.Blue  // ← Direct access
        }
      )
    }
  )
```

✅ Nested selectors fully inlined:

- Outer: `_.Primary(color = _.Blue)` → `Style.Primary.apply(...)`
- Inner: `_.Blue` → `Color.Blue`

## 2. Default with Nested Selector (defaultButton)

```scala 3
val defaultButton: advanced.Button =
  advanced.Button.apply(
    {
      val _$1: advanced.Button.Style = advanced.Button.Style
      advanced.Button.Style.Primary.apply(
        {
          val _$2: advanced.Button.Color = advanced.Button.Color
          _$2.Green  // ← Direct access
        }
      )
    }
  )
```

✅ Nested default fully inlined:

- Default _.Primary(color = _.Green) is completely evaluated
- No function calls, just direct member access

## 3. Runtime Code is Clean

The final phase shows inline methods are erased:

```scala 3
private inline def defaultStyle: advanced.Button.StyleSelector =
  scala.compiletime.erasedValue[...]
```

No runtime overhead - the inline machinery exists only during compilation.

What You Achieved

✅ Nested inline selectors work perfectly
✅ Defaults with nested selectors work perfectly
✅ Complete compile-time evaluation - zero lambdas in bytecode
✅ Clean syntax: Button(style = _.Primary(color = _.Blue))

This pattern is production-ready for your ButtonL implementation!
