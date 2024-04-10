package BaiTap14;

public class SortingStudent {
    public static void main(String[] args) {
        Student[] students = getStudents();
        System.out.println("Danh sach sinh vien truoc khi sap xep: ");
        for (Student student : students) {
            System.out.println(String.format("ID: %d, Name: %s, Score: %.1f", student.getId(), student.getName(), student.getScore()));
        }
        bubbleSort(students);
        System.out.println("Danh sach sinh vien sau khi sap xep bang sap xep sui bot: ");
        for (Student student : students) {
            System.out.println(String.format("ID: %d, Name: %s, Score: %.1f", student.getId(), student.getName(), student.getScore()));
        }
        selectionSort(students);
        System.out.println("Danh sach sinh vien sau khi sap xep bang sap xep chon: ");
        for (Student student : students) {
            System.out.println(String.format("ID: %d, Name: %s, Score: %.1f", student.getId(), student.getName(), student.getScore()));
        }
        insertionSort(students);
        System.out.println("Danh sach sinh vien sau khi sap xep bang sap xep chen: ");
        for (Student student : students) {
            System.out.println(String.format("ID: %d, Name: %s, Score: %.1f", student.getId(), student.getName(), student.getScore()));
        }

        
    }
    private static Student[] getStudents() {
        Student[] students = new Student[5];
        students[0] = new Student(1, "Nguyen Van A", 8.5);
        students[1] = new Student(2, "Nguyen Van B", 7.5);
        students[2] = new Student(3, "Nguyen Van C", 9.5);
        students[3] = new Student(4, "Nguyen Van D", 6.5);
        students[4] = new Student(5, "Nguyen Van E", 5.5);
        return students;
    }
    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (students[j].getScore() > students[j+1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (students[j].getScore() < students[min_idx].getScore()) {
                    min_idx = j;
                }
            }
            Student temp = students[min_idx];
            students[min_idx] = students[i];
            students[i] = temp;
        }
    }
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
