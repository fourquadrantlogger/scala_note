//# 泛型

class Reference[T] {
  private[this] var contents: T = _

  def set(value: T) {
    contents = value
  }

  def get: T = contents
}