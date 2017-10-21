
void chapter1()
{
  Peter = new Pessoa(Peter);
  Sophia = new Pessoa(Sophia);
  Peter.setMood(Lonely);
  Peter.callTo(Sophia);
  Sophia.pickUp(Phone);
  Sophia.talksTo(Peter);
  Peter.setMood(Glad);
  Sophia.say("Who are you?");
  Sophia.setMood(Annoyed);
  Peter.say("Peter.");
  Sophia.setMood(Angry);
  Sophia.say("You should not call me , you already know that.");
  Peter.setMood(Angry);
  Peter.say("But we are friends, aren't we?");
  Sophia.say("No. You did something unforgivable to me. You are crazy?. How can you even dare to call me?");
  Sophia.say("You got a new number just to call me? Can you leave me be? Stalker.");
  Peter.think(5);
  Peter.pickUP(Vodka);
  Peter.drink(Vodka);
  Peter.say("You don't understand. I did it for your own sake");
  Peter.say("He wasn't the person that you thought.");
  Peter.drink(Vodka);
  Sophia.say("HE WAS MY FIANCÉE. We was 6 years together.");
  Peter.say("He was a cyber terrorist");
  Peter.drink(Vodka);
  Sophia.setMood(Denial);
  Sophia.say("How come? He was a kindergarden teacher. You know that. The school knows that. for God's sake everybody knwon that");
  Peter.drink(Vodka);
  Sophia.lookAt(Daniel,Photo);
  Sophia.cry(Silent);
  Sophia.say("You set him up. You gave him that pendrive. He was sent to jail and it's your fault.");
  Peter.drink(Vodka);
  Vodka.setQuantity(Empty);
  Peter.yell("YOU HAVE TO BELIVE ME!");
  Sophia.hangUp();
  changeTime(1,Hour);
  Peter.setStatus(Drunk);
  Peter.cry(Loudly);
  Peter.setMood(Despair);
  Peter.setLocation(Bathroom);
  Peter.pick(SleepPillBottle);
  While(SleepPillBottle not Empty)
  {
    Peter.consume(SleepPill);
  }
  Peter.sleep();
  Peter.setStatus(Dead);
  Delete(Peter);
}

void chapter2()
{
  date(1,9,2000);
  Daniel = new Pessoa;
  Sophia = new Pessoa;

  Daniel.setAge(20);
  Sophia.setAge(18);

  setLocation(University,Catering);
  Sophia.setStatus(Freshman);

}
