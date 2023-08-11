import com.example.domain.model.Dog

interface DogRepository {
    suspend fun getRandom(): Dog
}