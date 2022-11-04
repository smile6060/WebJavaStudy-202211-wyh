package j18_제네릭.빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public class User {
        private String username;
        private String password;
        private String email;
        private String name;

//    public void User(String username) {
//        this.username = username;
//    }
//
//    public void User(String email) { //오버로딩 변수명이 같아서 이거는 할 수 없다. 이런경우에는 노아규컨설터해서 일일이 셋해줘야한다.
//        this.email = email;
//    }


        public static class UserBuilder {
            private String username;
            private String password;
            private String email;
            private String name;

            public UserBuilder username(String username) {
                this.username = username;
                return this;
            }

            public UserBuilder username(String password) {
                this.username = username;
                return this;
            }

            public UserBuilder username(String email) {
                this.username = username;
                return this;
            }

            public UserBuilder username(String name) {
                this.username = username;
                return this;
            }

            public User build() {
                return new User(username, password, email, name);
            }

            public UserBuilder email(String s) {
            }
        }

        public static UserBuilder builder() {
            return new UserBuilder() {

            }
        }
    }
