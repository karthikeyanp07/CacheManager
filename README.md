# CacheManager
CacheManager is a utility class that provides a singleton instance of a persistent media cache using SimpleCache from androidx.media3. It enables efficient offline media playback and data reuse by storing streamed content locally.

In androidx.media3, SimpleCache is part of the media3-datasource module and works seamlessly with the ExoPlayer-based player. It uses a CacheEvictor (like LeastRecentlyUsedCacheEvictor) to manage disk usage, and a DatabaseProvider to store cache metadata.

✅ Purpose:
Store media data locally for offline access,
Improve performance by avoiding repeated downloads,
Reduce network usage,
Manage cache size and eviction policy automatically.

 🧩 Key Components Used:
SimpleCache – stores media on disk,
CacheEvictor – manages when to evict data (e.g., LRU strategy),
DatabaseProvider – stores cache metadata using SQLite,
StandaloneDatabaseProvider – convenient implementation of DatabaseProvider.

 🧠 Why It’s Needed:
With androidx.media3, media caching remains a core feature for streaming apps, especially when:
Offline playback is needed,
Network efficiency is a priority,
You want fine-grained control over caching behavior.
