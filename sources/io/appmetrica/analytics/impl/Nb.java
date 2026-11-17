package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Nb implements InterfaceC3433cb, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f46257a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46258b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46259c = "preferences";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Mb f46260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f46261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T6 f46262f;

    public Nb(T6 t13) {
        this.f46262f = t13;
        Mb mb3 = new Mb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(Od.a())));
        this.f46260d = mb3;
        mb3.start();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    public static void a(Nb nb3) {
        SQLiteDatabase sQLiteDatabaseA;
        Object obj;
        nb3.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabaseA = nb3.f46262f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    Cursor cursorQuery = sQLiteDatabaseA.query(nb3.f46259c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("key"));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("value"));
                            int i13 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i13 != 1) {
                                    if (i13 == 2) {
                                        obj = ParseUtils.parseInt(string2);
                                    } else if (i13 == 3) {
                                        obj = ParseUtils.parseLong(string2);
                                    } else if (i13 != 4) {
                                        if (i13 != 5) {
                                            obj = string2;
                                            obj = null;
                                        } else {
                                            obj = string2;
                                            obj = ParseUtils.parseFloat(string2);
                                        }
                                    }
                                } else if ("true".equals(string2)) {
                                    obj = Boolean.TRUE;
                                } else if ("false".equals(string2)) {
                                    obj = Boolean.FALSE;
                                } else {
                                    obj = string2;
                                    obj = null;
                                }
                                if (obj != null) {
                                    nb3.f46257a.put(string, obj);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    cursor = cursorQuery;
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            sQLiteDatabaseA = null;
        }
        io.a(cursor);
        nb3.f46262f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final void b() {
        synchronized (this.f46260d) {
            this.f46260d.notifyAll();
        }
    }

    public final void c() {
        if (this.f46261e) {
            return;
        }
        try {
            this.f46257a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f46260d.isRunning()) {
            this.f46260d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final boolean getBoolean(String str, boolean z13) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z13;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final int getInt(String str, int i13) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i13;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final long getLong(String str, long j13) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j13;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb remove(String str) {
        synchronized (this.f46257a) {
            c();
            this.f46257a.remove(str);
        }
        synchronized (this.f46260d) {
            this.f46258b.put(str, this);
            this.f46260d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f46257a) {
            c();
            obj = this.f46257a.get(str);
        }
        return obj;
    }

    public static void a(Nb nb3, HashMap map) {
        SQLiteDatabase sQLiteDatabaseA;
        nb3.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i13 = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == nb3) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i13] = contentValues;
            i13++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = nb3.f46262f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i14 = 0; i14 < size; i14++) {
                        ContentValues contentValues2 = contentValuesArr[i14];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(nb3.f46259c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(nb3.f46259c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        nb3.f46262f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final synchronized InterfaceC3433cb a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb a(String str, long j13) {
        a(str, Long.valueOf(j13));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final synchronized InterfaceC3433cb a(int i13, String str) {
        a(str, Integer.valueOf(i13));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb a(String str, boolean z13) {
        a(str, Boolean.valueOf(z13));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb a(String str, float f13) {
        a(str, Float.valueOf(f13));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f46257a) {
            c();
            zContainsKey = this.f46257a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f46257a) {
            hashSet = new HashSet(this.f46257a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f46257a) {
            c();
            this.f46257a.put(str, obj);
        }
        synchronized (this.f46260d) {
            this.f46258b.put(str, obj);
            this.f46260d.notifyAll();
        }
    }
}
