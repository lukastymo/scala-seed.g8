package example

import cats.effect._
import cats.implicits._

object Hello extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    IO(println("Hello, World!")).as(ExitCode.Success)
}
