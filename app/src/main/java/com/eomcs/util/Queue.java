package com.eomcs.util;

public class Queue<E> extends List<E> implements Cloneable{

  public boolean offer(E e) {
    this.add(e);
    return true;
  }

  public E poll() {
    return this.delete(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> queue = new Queue<>();
    Object[] values = this.toArray();
    for (Object value : values) {
      queue.offer((E) value);
    } // 겟보다 퍼포먼스 측에서 더 나음
    return queue;
  }

  @Override
  public Iterator<E> iterator() throws CloneNotSupportedException {
    Queue<E> queue = this.clone();
    return new Iterator<E>() {
      // 만약 로컬 클래스에서 바깥 메서드의 로컬 변수를 사용한다면
      // 컴파일러는 로컬 변수의 값을 저장할 필드를 자동생성한다. 
      @Override
      public boolean hasNext() {
        return queue.size() > 0;
      }

      @Override
      public E next() {
        return queue.poll();
      }
    };
  }
}
