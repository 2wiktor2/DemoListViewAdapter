package com.wiktor.demolistviewadapter.Activity;

public class Copy1 {
    // Порядок создания
/*1 Создать List View в разметке активити или фрагмента

      //2 Создать Item - один элемент списка в xml
3 получить доступ к ListView из активити
    private ListView listView;
4 получить ListView
    listView = findViewById(R.id.list_view);
5 Заполнение данными:
            1 Создать метод который будет возвращать список слов
    private List<String> initData (){
        return null;
    }
    2 Создаем новый лист
    List<String> list = new ArrayList<String>();
    3 Возвращаем list
             return list;
    4 Заполняем list.add("1");
6 Создать ArrayAdapter
    ArrayAdapter<String> adapter = new ArrayAdapter <>()

    Вкачестве параметра предать контекст getApplicationContext()
    или просто this

    и указать ресурс   android.R.layout.simple_list_item_1 - стандартный
    из библиотеки android

    передать список элементов массива (массив или коллекция)
    initData () или для наглядности вынесем список в переменную

7. Применить адаптер к списку listView
        listView.setAdapter(adapter);*/
/*

    public class MainActivity extends AppCompatActivity {

        private ListView listView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            listView = findViewById(R.id.list_view);

            // для наглядности
            List<String> items = initData();

            ArrayAdapter<String> adapter = new ArrayAdapter <String>
                    (this, android.R.layout.simple_list_item_1, items);

            listView.setAdapter(adapter);
        }

        private List<String> initData (){
            List<String> list = new ArrayList<String>();
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("5");
            list.add("6");
            list.add("7");
            list.add("8");
            list.add("9");
            list.add("10");


            return list;
        }
    }
*/

}
