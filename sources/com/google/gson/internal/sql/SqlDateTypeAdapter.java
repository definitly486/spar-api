package com.google.gson.internal.sql;

import ce.ppxfxbqfkf;
import ce.zoijcleaow;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
final class SqlDateTypeAdapter extends TypeAdapter {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final vdvldrhtss f25159zoijcleaow = new vdvldrhtss() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.vdvldrhtss
        public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar.ppxfxbqfkf() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final DateFormat f25160iobyxmoadg;

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public Date zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
        java.util.Date date;
        if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
            iobyxmoadgVar.wwaezpbzkn();
            return null;
        }
        String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
        try {
            synchronized (this) {
                date = this.f25160iobyxmoadg.parse(strDsvhmnatus);
            }
            return new Date(date.getTime());
        } catch (ParseException e13) {
            throw new JsonSyntaxException("Failed parsing '" + strDsvhmnatus + "' as SQL Date; at path " + iobyxmoadgVar.rgvfuqvkyq(), e13);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Date date) throws IOException {
        String str;
        if (date == null) {
            ppxfxbqfkfVar.jyumaefscl();
            return;
        }
        synchronized (this) {
            str = this.f25160iobyxmoadg.format((java.util.Date) date);
        }
        ppxfxbqfkfVar.ulzqkzuiru(str);
    }

    private SqlDateTypeAdapter() {
        this.f25160iobyxmoadg = new SimpleDateFormat("MMM d, yyyy");
    }
}
