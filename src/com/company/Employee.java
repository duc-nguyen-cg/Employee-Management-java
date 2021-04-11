package com.company;

public abstract class Employee {
        private String id, name, age, phone, email;

        public Employee() {
        }

        public Employee(String id, String name, String age, String phone, String email) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.phone = phone;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public abstract double getPayment();

        @Override
        public String toString() {
            return (id +". "
                    + " \t " + name
                    + " \t " + age
                    + " \t " + phone
                    + " \t " + email
                    + " \t " + getPayment());
        }
    }

