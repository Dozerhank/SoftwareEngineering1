public class Turtle {
    int courages = -3;
    String status = "disliked";

    public void seen()  {
        if (courages == 3)  {
            System.out.println("Turtle has exploded into cherry blossoms and drifted away like Master Ugwe.");
        }   else if (courages < 3)   {
            courages++;
            if (courages == 3)  {
                status = "liked";
            }
        }
    }

    public String lose(int races)   {
        int temp = courages - races;
        if (temp <= -3) {
            courages = -3;
        }   else    {
            courages -= races;
        }

        if (courages == 3)  {
            status = "disliked";
        }

        return "The turtle has lost " + races + " courage in the race(s).";
    }

    public String socialstatus()    {
        return status;
    }

    public int bravery()    {
        return courages;
    }
}