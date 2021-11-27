package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{


        List<E> personList;

        public People() {

            personList = new ArrayList<E>();

        }

        public void add(E person) {

            personList.add(person);

        }

        public void findById(long id) {
            // todo
        }

        public boolean contains(Person person) {
            if (personList.contains(person)) {
                return true;
            } else {
                return false;
            }
        }

        public void remove(Person person) {
            for (E i: personList) {
                if (personList[i] != person) {
                    continue;
                }
                personList.remove(person);
            }

        }


    }
