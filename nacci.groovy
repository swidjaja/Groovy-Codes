/* Returns the mth value of nth-nacci sequence
 * @param nth the nth-acci sequence - ex: tribonacci
 * @param midx the mth index
 * @return the mth index value of the acci-sequence
 */
def nacci(nth, midx) {
    def seed = [1, 1]
    def idx
    def idy

    for (idx = seed.size(); idx <= midx; idx++) {
        seed[idx] = 0;
        for (idy = 1; idx >= idy && idy <= nth; idy++ ) {
            seed[idx] += seed[idx - idy];
        }
    }
    seed[seed.size() - 1];
}