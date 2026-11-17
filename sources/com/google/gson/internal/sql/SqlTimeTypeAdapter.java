package com.google.gson.internal.sql;

import ce.ppxfxbqfkf;
import ce.zoijcleaow;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends TypeAdapter {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final vdvldrhtss f25161zoijcleaow = new vdvldrhtss() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.vdvldrhtss
        public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar.ppxfxbqfkf() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final DateFormat f25162iobyxmoadg;

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public Time zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
        Time time;
        if (iobyxmoadgVar.kegysxyocb() == zoijcleaow.NULL) {
            iobyxmoadgVar.wwaezpbzkn();
            return null;
        }
        String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
        try {
            synchronized (this) {
                time = new Time(this.f25162iobyxmoadg.parse(strDsvhmnatus).getTime());
            }
            return time;
        } catch (ParseException e13) {
            throw new JsonSyntaxException("Failed parsing '" + strDsvhmnatus + "' as SQL Time; at path " + iobyxmoadgVar.rgvfuqvkyq(), e13);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Time time) throws IOException {
        String str;
        if (time == null) {
            ppxfxbqfkfVar.jyumaefscl();
            return;
        }
        synchronized (this) {
            str = this.f25162iobyxmoadg.format((Date) time);
        }
        ppxfxbqfkfVar.ulzqkzuiru(str);
    }

    private SqlTimeTypeAdapter() {
        this.f25162iobyxmoadg = new SimpleDateFormat("hh:mm:ss a");
    }
}
