package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg implements zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f11441iobyxmoadg;

    public iobyxmoadg() {
        this(-1);
    }

    @Override // androidx.media3.exoplayer.upstream.zoijcleaow
    public long iobyxmoadg(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        IOException iOException = iobyxmoadgVar.f11443ppxfxbqfkf;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.iobyxmoadg(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((iobyxmoadgVar.f11444wkgbmnqykc - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.zoijcleaow
    public int zoijcleaow(int i13) {
        int i14 = this.f11441iobyxmoadg;
        if (i14 == -1) {
            return i13 == 7 ? 6 : 3;
        }
        return i14;
    }

    public iobyxmoadg(int i13) {
        this.f11441iobyxmoadg = i13;
    }
}
