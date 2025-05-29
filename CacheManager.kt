@androidx.annotation.OptIn(androidx.annotation.experimental.UnstableApi::class)
object CacheManager 
{

    @Volatile
    private var simpleCache: Cache? = null

    fun getInstance(context: Context): Cache 
    {
        return simpleCache ?: synchronized(this) 
        {
            simpleCache ?: run {
                val cacheDir = File(context.cacheDir, "SocialFrolicMedia")
                val cacheEvictor = LeastRecentlyUsedCacheEvictor(100 * 1024 * 1024L) // 100MB
                val databaseProvider = StandaloneDatabaseProvider(context)
                SimpleCache(cacheDir, cacheEvictor, databaseProvider).also {
                    simpleCache = it
                }
            }
        }
    }
}