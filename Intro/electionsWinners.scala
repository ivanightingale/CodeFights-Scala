def electionsWinners(votes: Array[Int], k: Int): Int = {
    votes.indices.count(i => votes.indices.forall(oi => i == oi || votes(i) + k > votes(oi)))
}
