# Углубленный курс Java
### Домашнее задание 1

1. На вход подаётся массив строк. Требуется вернуть массив, в котором строки следуют в порядке роста длины. Строки равной длины не упорядочиваются.

2. Заполнить треугольную матрицу чтобы прошли тесты

    Треугольная матрица - это матрица вида:
    1
    2 3
    4 5 6
    Вам дано количество строк в результирующей матрице. Вам нужно заполнить ее. 
    Например, для 1
    {{1}}
    Для 2
    {{1}, {2, 3}}
    и т.д.
    
    Каркас
    ```java
        public class TriangleMatrix {
            public int[][] rows(int count) {
                int[][] triangle = new int[count][];
                // your code here
                return triangle;
            }
        }
    ```
     Тесты 
    ```java
        import org.junit.Test;
        import static org.junit.Assert.*;
    
        public class TriangleMatrixTest {
            @Test
            public void whenRows1() {
                        TriangleMatrix  triangleMatrix;
                int[][] result = {{1}};
                assertArrayEquals(result, triangleMatrix.rows(1));
            }
    
            @Test
            public void whenRows2() {
                int[][] result = {{1}, {2, 3}};
                assertArrayEquals(result, triangleMatrix.rows(2));
            }
    
            @Test
            public void whenRows3() {
                int[][] result = {{1}, {2, 3}, {4, 5, 6}};
                assertArrayEquals(result, triangleMatrix.rows(3));
            }
        }
    ```

3. Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке. Не используйте дополнительный массив для хранения результатов.
