public class Solver 
{
    public static int[] solve()
    {
        // All variables must be between 1-14, with no repeated numbers
        // The following equations must be true:
        /*
         * H + F + C = D + G + I (can be determined after I is defined)
         * A + D + G = K + L + M (can be determined after M is defined)
         * I + K + L = J + F + B (can be determined after L is defined)
         * M + J + F = C + D + E (can be determined after M is defined)
         * B + C + D = G + K + N (can be determined after N is defined)
         * E + G + K = L + J + H (can be determined after L is defined)
         * N + L + J = F + C + A (can be determined after N is defined)
         */
        int[] terms = new int[14];

        for (int A = 1; A <= 14; A++)
        {
            for (int B = 1; B <= 14; B++)
            {
                if (B == A)
                {
                    continue;
                }
                for (int C = 1; C <= 14; C++)
                {
                    if (C == A || C == B)
                    {
                        continue;
                    }
                    for (int D = 1; D <= 14; D++)
                    {
                        if (D == A || D == B || D == C)
                        {
                            continue;
                        }
                        for (int E = 1; E <= 14; E++)
                        {
                            if (E == A || E == B || E == C || E == D)
                            {
                                continue;
                            }
                            for (int F = 1; F <= 14; F++)
                            {
                                if (F == A || F == B || F == C || F == D || F == E)
                                {
                                    continue;
                                }
                                for (int G = 1; G <= 14; G++)
                                {
                                    if (G == A || G == B || G == C || G == D || G == E || G == F)
                                    {
                                        continue;
                                    }
                                    for (int H = 1; H <= 14; H++)
                                    {
                                        if (H == A || H == B || H == C || H == D || H == E || H == F || H == G)
                                        {
                                            continue;
                                        }
                                        for (int I = 1; I <= 14; I++)
                                        {
                                            if (I == A || I == B || I == C || I == D || I == E || I == F || I == G || I == H)
                                            {
                                                continue;
                                            }

                                            if (H + F + C != D + G + I)
                                            {
                                                continue;
                                            }

                                            for (int J = 1; J <= 14; J++)
                                            {
                                                if (J == A || J == B || J == C || J == D || J == E || J == F || J == G || J == H || J == I)
                                                {
                                                    continue;
                                                }
                                                for (int K = 1; K <= 14; K++)
                                                {
                                                    if (K == A || K == B || K == C || K == D || K == E || K == F || K == G || K == H || K == I || K == J)
                                                    {
                                                        continue;
                                                    }
                                                    for (int L = 1; L <= 14; L++)
                                                    {
                                                        if (L == A || L == B || L == C || L == D || L == E || L == F || L == G || L == H || L == I || L == J || L == K)
                                                        {
                                                            continue;
                                                        }

                                                        if (I + K + L != J + F + B || E + G + K != L + J + H)
                                                        {
                                                            continue;
                                                        }

                                                        for (int M = 1; M <= 14; M++)
                                                        {
                                                            if (M == A || M == B || M == C || M == D || M == E || M == F || M == G || M == H || M == I || M == J || M == K || M == L)
                                                            {
                                                                continue;
                                                            }

                                                            if (A + D + G != K + L + M || M + J + F != C + D + E)
                                                            {
                                                                continue;
                                                            }

                                                            for (int N = 1; N <= 14; N++)
                                                            {
                                                                if (N == A || N == B || N == C || N == D || N == E || N == F || N == G || N == H || N == I || N == J || N == K || N == L || N == M)
                                                                {
                                                                    continue;
                                                                }

                                                                if (B + C + D != G + K + N || N + L + J != F + C + A)
                                                                {
                                                                    continue;
                                                                }

                                                                terms[0] = A;
                                                                terms[1] = B;
                                                                terms[2] = C;
                                                                terms[3] = D;
                                                                terms[4] = E;
                                                                terms[5] = F;
                                                                terms[6] = G;
                                                                terms[7] = H;
                                                                terms[8] = I;
                                                                terms[9] = J;
                                                                terms[10] = K;
                                                                terms[11] = L;
                                                                terms[12] = M;
                                                                terms[13] = N;

                                                                return terms;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] terms = solve();
        if (terms != null)
        {
            System.out.println("A: " + terms[0]);
            System.out.println("B: " + terms[1]);
            System.out.println("C: " + terms[2]);
            System.out.println("D: " + terms[3]);
            System.out.println("E: " + terms[4]);
            System.out.println("F: " + terms[5]);
            System.out.println("G: " + terms[6]);
            System.out.println("H: " + terms[7]);
            System.out.println("I: " + terms[8]);
            System.out.println("J: " + terms[9]);
            System.out.println("K: " + terms[10]);
            System.out.println("L: " + terms[11]);
            System.out.println("M: " + terms[12]);
            System.out.println("N: " + terms[13]);
        }
        else
        {
            System.out.println("No solution found.");
        }
    }
}
