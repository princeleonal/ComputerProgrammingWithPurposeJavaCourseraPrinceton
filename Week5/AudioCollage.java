public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {

        if (alpha == 1)
            return a;
        else {
            double[] b = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i] * alpha;
            }
            return b;
        }

    }

    // // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length - i - 1] = a[i];
        }
        return b;

    }

    // // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double c[] = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        return c;
    }

    // // Returns a new array that is the sum of a[] and b[],
    // // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int maxLength = Math.max(a.length, b.length);
        double[] c = new double[maxLength];
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length && i < b.length)
                c[i] = b[i] + a[i];
            else if (i >= a.length)
                c[i] = b[i];
            else
                c[i] = a[i];
        }
        return c;
    }

    // // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int newSamples = (int) (a.length / alpha);
        double[] resampled = new double[newSamples];
        for (int i = 0; i < newSamples; i++) {
            resampled[i] = a[(int) (i * alpha)];
        }
        return resampled;
    }

    // // Creates an audio collage and plays it on standard audio.
    // // See below for the requirements.
    public static void main(String[] args) {

        double[] music1 = StdAudio.read("piano.wav");
        double[] music2 = StdAudio.read("singer.wav");
        double[] music3 = StdAudio.read("beatbox.wav");
        double[] music4 = StdAudio.read("harp.wav");
        double[] music5 = StdAudio.read("buzzer.wav");
        double[] music1_speed = changeSpeed(music3, 10);
        double[] merged = merge(music1, music2);
        double[] mixed = mix(music2, merged);
        double[] amplified = amplify(mixed, 2);
        double[] reversed = reverse(amplified);
        StdAudio.play(reversed);

    }
}
