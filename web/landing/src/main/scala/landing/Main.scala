package landing

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom
import scala.scalajs.js

object Main {

  private val gradient =
    "linear-gradient(-225deg, #231557 0%, #44107A 29%, #FF1361 67%, #FFF800 100%)"

  private val githubUrl = "https://github.com/aathoos/aathu-lang"

  private def gradientTextStyle = js.Dynamic.literal(
    background              = gradient,
    WebkitBackgroundClip    = "text",
    WebkitTextFillColor     = "transparent",
    backgroundClip          = "text",
    display                 = "inline-block",
  )

  private def accentBarStyle = js.Dynamic.literal(
    background = gradient,
    height     = "4px",
    width      = "100%",
  )

  private def ctaStyle = js.Dynamic.literal(
    background = gradient,
  )

  // ---------------------------------------------------------------------------
  // Navbar
  // ---------------------------------------------------------------------------

  private val Navbar = ScalaFnComponent[Unit] { _ =>
    <.nav(
      ^.className := "border-b border-gray-100",
      <.div(
        ^.className := "max-w-4xl mx-auto px-6 py-4 flex items-center justify-between",
        <.span(
          ^.className := "font-mono font-bold text-xl",
          ^.style     := gradientTextStyle,
          "aathu",
        ),
        <.a(
          ^.href   := githubUrl,
          ^.target := "_blank",
          ^.rel    := "noopener noreferrer",
          ^.className := "text-sm text-gray-500 hover:text-gray-900",
          "GitHub ↗",
        ),
      ),
    )
  }

  // ---------------------------------------------------------------------------
  // Hero
  // ---------------------------------------------------------------------------

  private val Hero = ScalaFnComponent[Unit] { _ =>
    <.section(
      ^.className := "max-w-4xl mx-auto px-6 py-24",
      <.h1(
        ^.className := "text-5xl font-bold tracking-tight text-gray-900 leading-tight mb-6",
        "Automation and scripting,",
        <.br(),
        "without the overhead.",
      ),
      <.p(
        ^.className := "text-lg text-gray-500 max-w-xl leading-relaxed mb-10",
        "aathu is a modern, lightweight scripting language built for simple and efficient task automation. " +
        "Clean syntax. Fast execution. Minimal overhead.",
      ),
      <.a(
        ^.href      := githubUrl,
        ^.target    := "_blank",
        ^.rel       := "noopener noreferrer",
        ^.className := "inline-block text-sm font-medium text-white px-5 py-2.5 rounded",
        ^.style     := ctaStyle,
        "View on GitHub ↗",
      ),
    )
  }

  // ---------------------------------------------------------------------------
  // Code block
  // ---------------------------------------------------------------------------

  private val codeExample =
    """|fn greet(name) {
       |  print("Hello, " + name + "!")
       |}
       |
       |fn main() {
       |  greet("world")
       |
       |  for i in 0..5 {
       |    print(i)
       |  }
       |}""".stripMargin

  private val CodeBlock = ScalaFnComponent[Unit] { _ =>
    <.section(
      ^.className := "max-w-4xl mx-auto px-6 pb-24",
      <.div(
        ^.className := "rounded-lg overflow-hidden bg-gray-950",
        // title bar
        <.div(
          ^.className := "flex items-center gap-2 px-4 py-3 border-b border-gray-800",
          <.span(^.className := "w-2.5 h-2.5 rounded-full bg-gray-700"),
          <.span(^.className := "w-2.5 h-2.5 rounded-full bg-gray-700"),
          <.span(^.className := "w-2.5 h-2.5 rounded-full bg-gray-700"),
          <.span(
            ^.className := "ml-2 text-xs text-gray-500 font-mono",
            "hello.aathu",
          ),
        ),
        // code
        <.pre(
          ^.className := "px-6 py-5 text-sm font-mono text-gray-300 leading-relaxed overflow-x-auto",
          <.code(codeExample),
        ),
      ),
    )
  }

  // ---------------------------------------------------------------------------
  // Features
  // ---------------------------------------------------------------------------

  private final case class Feature(title: String, desc: String)

  private val featureList = List(
    Feature("Lexer & Parser",
      "Hand-written lexer and recursive descent parser with precise source spans."),
    Feature("Type Checker",
      "Static type inference with clear, actionable error diagnostics."),
    Feature("VM & Runtime",
      "Bytecode virtual machine with a minimal, fast execution runtime."),
    Feature("Formatter",
      "Opinionated code formatter — one style, zero configuration."),
    Feature("LSP Server",
      "Language server protocol support for editor integration."),
    Feature("Package Manager",
      "Built-in package manager for managing project dependencies."),
  )

  private val Features = ScalaFnComponent[Unit] { _ =>
    <.section(
      ^.className := "border-t border-gray-100",
      <.div(
        ^.className := "max-w-4xl mx-auto px-6 py-20",
        <.h2(
          ^.className := "text-2xl font-bold text-gray-900 mb-12",
          "What's included",
        ),
        <.div(
          ^.className := "grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-x-8 gap-y-10",
          featureList.zipWithIndex.toVdomArray { case (f, idx) =>
            <.div(
              ^.key       := idx.toString,
              <.h3(
                ^.className := "font-semibold text-gray-900 text-sm mb-1",
                f.title,
              ),
              <.p(
                ^.className := "text-sm text-gray-500 leading-relaxed",
                f.desc,
              ),
            )
          },
        ),
      ),
    )
  }

  // ---------------------------------------------------------------------------
  // Footer
  // ---------------------------------------------------------------------------

  private val Footer = ScalaFnComponent[Unit] { _ =>
    <.footer(
      ^.className := "border-t border-gray-100",
      <.div(
        ^.className :=
          "max-w-4xl mx-auto px-6 py-8 flex flex-col sm:flex-row items-center justify-between gap-4",
        <.span(
          ^.className := "text-sm text-gray-400",
          "MIT License — Early development",
        ),
        <.a(
          ^.href      := githubUrl,
          ^.target    := "_blank",
          ^.rel       := "noopener noreferrer",
          ^.className := "text-sm text-gray-400 hover:text-gray-700",
          "github.com/aathoos/aathu-lang ↗",
        ),
      ),
    )
  }

  // ---------------------------------------------------------------------------
  // Root app
  // ---------------------------------------------------------------------------

  private val App = ScalaFnComponent[Unit] { _ =>
    <.div(
      ^.className := "min-h-screen bg-white text-gray-900 antialiased",
      <.div(^.style := accentBarStyle),
      Navbar(),
      Hero(),
      CodeBlock(),
      Features(),
      Footer(),
    )
  }

  def main(args: Array[String]): Unit = {
    val container = dom.document.getElementById("root")
    App().renderIntoDOM(container)
  }
}
