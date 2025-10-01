package advanced

case class Button(style: Button.ButtonStyle)

object Button {
  private inline def defaultStyle: StyleSelector = _.Primary(color = _.Green)

  transparent inline def apply(
      inline style: StyleSelector = defaultStyle
  ): Button = {
    Button(style = style(Style))
  }

  sealed trait Color
  object Color {
    case object Red extends Color
    case object Green extends Color
    case object Blue extends Color
  }

  sealed trait ButtonStyle
  object Style {
    case class Primary(color: Color) extends ButtonStyle
    object Primary {
      private inline def defaultColor: ColorSelector = _.Red
      transparent inline def apply(
          inline color: ColorSelector = defaultColor
      ): Primary = {
        Primary(color = color(Color))
      }
    }
    case class Secondary(color: Color) extends ButtonStyle
  }

  type StyleSelector = Style.type => ButtonStyle
  type ColorSelector = Color.type => Color
}

@main def run() = {
  // Usage - compiled to ButtonL(Style.DarkMode) with no lambda!
  val myButton = Button(style = _.Primary(color = _.Blue))
  val defaultButton = Button()
  println(myButton)
  println(defaultButton)
}
