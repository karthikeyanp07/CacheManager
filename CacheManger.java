@UnstableApi
public class CacheManger
{
    private static volatile Cache simpleCache;

    @OptIn(markerClass = UnstableApi.class)
    public static Cache getInstance(Context context)
    {
        if (simpleCache == null)
        {
            synchronized (CacheManger.class)
            {
                if (simpleCache == null)
                {
                    File cacheDir = new File(context.getCacheDir(), "SocialFrolicMedia");
                    CacheEvictor cacheEvictor = new LeastRecentlyUsedCacheEvictor(100 * 1024 * 1024); // 100MB cache
                    StandaloneDatabaseProvider databaseProvider = new StandaloneDatabaseProvider(context);
                    simpleCache = new SimpleCache(cacheDir, cacheEvictor, databaseProvider);
                }
            }
        }
        return simpleCache;
    }
}