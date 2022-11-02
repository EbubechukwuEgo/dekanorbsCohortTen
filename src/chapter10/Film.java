package chapter10;

public class Film {
    public static void main(String[] args) {
        FilmMakers producers = new Producer();
        FilmMakers screenwriters = new Screenwriter();
        FilmMakers director = new Director();
        FilmMakers filmMakers = new FilmMakers();
        FilmMakers animated = new AnimatedFilm();
        FilmMakers cinematographer = new Cinematographer();

        Actor actor = new Actor();
        Actor voiceActor = new VoiceActor();
        AnimatedFilm animator = new Animator();
        AnimatedFilm characterDesigner = new CharacterDesigner();

        filmMakers.action();
        producers.action();
        screenwriters.action();
        director.action();
        cinematographer.action();
        actor.action();

        animated.action();

        animator.action();
        characterDesigner.action();
        voiceActor.action();
    }
}
