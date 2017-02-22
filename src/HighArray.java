// highArray.java
// Клас масиву з високорівневим інтерфейсом
// Запуск программы: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray
{
    private long[] a;
    // Посилання на масив a
    private int nElems;
    // Кількість елементів в масиві
//-----------------------------------------------------------
    public HighArray(int max)
// Конструктор
    {
        a = new long[max];
// Створення масиву
        nElems = 0;
// Ще немає жодного елемента
    }
//-----------------------------------------------------------
public boolean find(long searchKey)
{
// Пошук заданого значення
    int j;
    for(j=0; j<nElems; j++)
// Для кожного елемента
        if(a[j] == searchKey)
// Значення знайдено?
            break;
// Да - вихід з циклу
    if(j == nElems)
// Досягнуто останній елемент?
        return false;
// Да
    else
        return true;
// Ні
}
    //-----------------------------------------------------------
    public void insert(long value)
// Вставка елемента в масив
    {
        a[nElems] = value;
// Власне вставка
        nElems++;
// Збільшення розміру
    }
    //-----------------------------------------------------------
    public boolean delete(long value)
    {
        int j;
        for(j=0; j<nElems; j++)
// Пошук заданого значення
            if( value == a[j] )
                break;
        if(j==nElems)
// Знайти не вдалось
            return false;
        else
// Значення знайдене
        {
            for(int k=j; k<nElems; k++) // Зсув наступних елементів
                a[k] = a[k+1];
            nElems--;
// Зменшення розміру
            return true;
        }
    }
    //-----------------------------------------------------------
    public void display()
// Вивід на екран масиву
    {
        for(int j=0; j<nElems; j++)
// Для кожного елемента
        System.out.print(a[j] + " "); // Вивід
        System.out.println("");
    }
//-----------------------------------------------------------
} // Кінець класу HighArray