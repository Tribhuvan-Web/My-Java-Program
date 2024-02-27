class phone {
    private int number;

    phone() {
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    public void call() {
        System.out.println("Call is made.");
    }

    public void message() {
        System.out.println("Your message has been sent.");
    }
}

class smartPhone extends phone {
    int cameraMegaPx;

    public void click() {
        System.out.println("A photograph has been clicked");
    }

    public void playMusic() {
        System.out.println("A music has been played.");
    }

    public void pauseMusic() {
        System.out.println("A music has been paused");
    }
}

class main {
    public static void main(String[] args) {
        smartPhone p1 = new smartPhone();
        p1.setNumber(9162);
        System.out.println("Your phone number is " + p1.getNumber());
        p1.pauseMusic();
        p1.playMusic();
        p1.click();
    }
}