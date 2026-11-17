package i3;

import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {
    private static long iobyxmoadg(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair zoijcleaow(DrmSession drmSession) {
        Map mapLqeggnwhkg = drmSession.lqeggnwhkg();
        if (mapLqeggnwhkg == null) {
            return null;
        }
        return new Pair(Long.valueOf(iobyxmoadg(mapLqeggnwhkg, "LicenseDurationRemaining")), Long.valueOf(iobyxmoadg(mapLqeggnwhkg, "PlaybackDurationRemaining")));
    }
}
