# 📦 CacheManager

`CacheManager` is a utility class that provides a **singleton instance** of a persistent media cache using `SimpleCache` from `androidx.media3`.  
It enables efficient **offline media playback** and **data reuse** by storing streamed content locally.

---

## ✅ Purpose

- Store media data locally for **offline access**
- Improve performance by **avoiding repeated downloads**
- **Reduce network usage** for better efficiency
- Automatically **manage cache size and eviction policy**

---

## 🧩 Key Components Used

- **SimpleCache** – Stores media files on disk
- **CacheEvictor** – Manages eviction (e.g., using LRU strategy)
- **DatabaseProvider** – Stores cache metadata in SQLite
- **StandaloneDatabaseProvider** – A convenient implementation of `DatabaseProvider`

---

## 🧠 Why It's Needed

Caching remains critical for streaming apps using `androidx.media3`, especially when:

- 🎞️ **Offline playback** is required
- 📶 **Network efficiency** is a high priority
- ⚙️ You want **fine-grained control** over caching behavior

---
