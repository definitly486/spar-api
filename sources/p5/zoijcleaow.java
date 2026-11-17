package p5;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import n5.oxmwwwfdhm;
import u5.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static final CancellationSignal iobyxmoadg() {
        return u5.zoijcleaow.zoijcleaow();
    }

    public static final Cursor ppxfxbqfkf(oxmwwwfdhm db3, btonecajqb sqLiteQuery, boolean z13, CancellationSignal cancellationSignal) {
        zdlpuopuiu.btonecajqb(db3, "db");
        zdlpuopuiu.btonecajqb(sqLiteQuery, "sqLiteQuery");
        Cursor cursorHcddaimhww = db3.hcddaimhww(sqLiteQuery, cancellationSignal);
        if (!z13 || !(cursorHcddaimhww instanceof AbstractWindowedCursor)) {
            return cursorHcddaimhww;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorHcddaimhww;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? iobyxmoadg.iobyxmoadg(cursorHcddaimhww) : cursorHcddaimhww;
    }

    public static final int wkgbmnqykc(File databaseFile) {
        zdlpuopuiu.btonecajqb(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i13 = byteBufferAllocate.getInt();
            rg.zoijcleaow.iobyxmoadg(channel, null);
            return i13;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(channel, th2);
                throw th3;
            }
        }
    }

    public static final void zoijcleaow(u5.lqeggnwhkg db3) {
        zdlpuopuiu.btonecajqb(db3, "db");
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        Cursor cursorE = db3.E("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorE.moveToNext()) {
            try {
                listPpxfxbqfkf.add(cursorE.getString(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(cursorE, th2);
                    throw th3;
                }
            }
        }
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        rg.zoijcleaow.iobyxmoadg(cursorE, null);
        for (String triggerName : jyumaefscl.iobyxmoadg(listPpxfxbqfkf)) {
            zdlpuopuiu.dxjokdxxww(triggerName, "triggerName");
            if (kcexrzcfyt.stevsuqkhv(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db3.lmojexxdyd("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }
}
