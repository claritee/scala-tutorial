package types

// Cache of generic Keys and Values
trait Cache[K, V] {
  def get(key: K): V
  def put(key: K, value: V)
  def delete(key: K)

  // method with type parameter
  def remove[K](key: K)
}