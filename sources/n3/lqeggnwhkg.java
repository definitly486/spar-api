package n3;

import java.util.Objects;
import q4.draadjrbmk;
import q4.oxmwwwfdhm;

/* JADX INFO: loaded from: classes.dex */
public interface lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lqeggnwhkg f68486iobyxmoadg = new iobyxmoadg();

    class iobyxmoadg implements lqeggnwhkg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final q4.nufgyqmvbu f68487zoijcleaow = new q4.nufgyqmvbu();

        iobyxmoadg() {
        }

        @Override // n3.lqeggnwhkg
        public boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            String str = iobyxmoadgVar.f9769ojitshcjhn;
            return this.f68487zoijcleaow.iobyxmoadg(iobyxmoadgVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // n3.lqeggnwhkg
        public draadjrbmk zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            String str = iobyxmoadgVar.f9769ojitshcjhn;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new r4.iobyxmoadg(str, iobyxmoadgVar.f9771pkzmftpjix, 16000L);
                    case "application/cea-708":
                        return new r4.ppxfxbqfkf(iobyxmoadgVar.f9771pkzmftpjix, iobyxmoadgVar.f9770oxmwwwfdhm);
                }
            }
            if (!this.f68487zoijcleaow.iobyxmoadg(iobyxmoadgVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            oxmwwwfdhm oxmwwwfdhmVarPpxfxbqfkf = this.f68487zoijcleaow.ppxfxbqfkf(iobyxmoadgVar);
            return new zoijcleaow(oxmwwwfdhmVarPpxfxbqfkf.getClass().getSimpleName() + "Decoder", oxmwwwfdhmVarPpxfxbqfkf);
        }
    }

    boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    draadjrbmk zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar);
}
