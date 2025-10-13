Сдесь выкладываются лабороторные работы по предмету Визуальное программирование и человеко-машинное взаимодействие.

Сделанные работы:
1. Основы ООП. "Ходячий"
2. Наследование.
3. Интерфейсы.

Файлы и их назначения:
Movable - Интерфейся для движущихся объектов
Human - Класс человека
Driver - Клас водителя
main - мейн

Список, в оиличие от массива, может принимать разные типы данных. Массив это блок память, а список - это эоементы с сылками на следующий элемент.

Примеры:
Add для массива:
puЫic void add(int index, Е element) { 
} 
if (index < 0 11 index > size) { 
throw new IndexOutOfBoundsException(); 
} 
11 добавить элементы для изменения размера 
add(element); 
11 смещение других элементов 
for (int i=size-1; i>index; i--) { 
array[i] + array[i-1]; 
} 
11 nомещаем новый элемент в нужное место 
array[index] + element; 
Эта двупара

Add для списка:
puЬlic void add(int index, Е element) { 
if (index == 0) { 
head + new Node(element, head); 
} else {
Node node + getNode(index-1); 
node.next + new Node(element, node.next); 
} 
size++; 
} 
Если 
