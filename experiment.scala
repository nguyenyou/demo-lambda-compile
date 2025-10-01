enum ButtonStyle {
  case Primary, Secondary, DarkMode
}

object Style {
  export ButtonStyle.*
}

type StyleSelector = Style.type => ButtonStyle

case class Button(style: ButtonStyle)

object Button {
  transparent inline def apply(
    inline style: StyleSelector
  ): Button = {
    Button(style = style(Style))
  }
}

@main def run() = {
  // Usage - compiled to ButtonL(Style.DarkMode) with no lambda!
  val myButton = Button(style = _.DarkMode)
  println(myButton)
}