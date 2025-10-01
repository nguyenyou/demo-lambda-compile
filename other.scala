package other

case class Button(style: Button.ButtonStyle)

object Button {
  private inline def defaultStyle: StyleSelector = s => s.DarkMode

  transparent inline def apply(
      inline style: StyleSelector = defaultStyle
  ): Button = {
    Button(style = style(Style))
  }

  enum ButtonStyle {
    case Primary, Secondary, DarkMode
  }

  object Style {
    export ButtonStyle.*
  }

  type StyleSelector = Style.type => ButtonStyle
}

@main def run() = {
  // Usage - compiled to ButtonL(Style.DarkMode) with no lambda!
  val myButton = Button(style = _.DarkMode)
  val defaultButton = Button()
  println(myButton)
  println(defaultButton)
}
