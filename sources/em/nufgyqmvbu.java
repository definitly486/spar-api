package em;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class nufgyqmvbu extends wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Comparator f31478ppxfxbqfkf = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ConcurrentMap f31479zoijcleaow = new ConcurrentHashMap(16, 0.75f, 2);

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((String) entry2.getKey()).length() - ((String) entry.getKey()).length();
        }
    }

    static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Map f31480iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f31481zoijcleaow;

        zoijcleaow(Map map) {
            this.f31480iobyxmoadg = map;
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (dxjokdxxww dxjokdxxwwVar : map.keySet()) {
                HashMap map3 = new HashMap();
                for (Map.Entry entry : ((Map) map.get(dxjokdxxwwVar)).entrySet()) {
                    map3.put(entry.getValue(), nufgyqmvbu.gxszxtbevo(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(map3.values());
                Collections.sort(arrayList2, nufgyqmvbu.f31478ppxfxbqfkf);
                map2.put(dxjokdxxwwVar, arrayList2);
                arrayList.addAll(arrayList2);
                map2.put(null, arrayList);
            }
            Collections.sort(arrayList, nufgyqmvbu.f31478ppxfxbqfkf);
            this.f31481zoijcleaow = map2;
        }

        String iobyxmoadg(long j13, dxjokdxxww dxjokdxxwwVar) {
            Map map = (Map) this.f31480iobyxmoadg.get(dxjokdxxwwVar);
            if (map != null) {
                return (String) map.get(Long.valueOf(j13));
            }
            return null;
        }
    }

    nufgyqmvbu() {
    }

    private String btonecajqb(int i13, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i13) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i13) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    private Object dxjokdxxww(gm.nufgyqmvbu nufgyqmvbuVar, Locale locale) {
        Map.Entry entryGxszxtbevo = gxszxtbevo(nufgyqmvbuVar, locale);
        Object obj = this.f31479zoijcleaow.get(entryGxszxtbevo);
        if (obj != null) {
            return obj;
        }
        this.f31479zoijcleaow.putIfAbsent(entryGxszxtbevo, nufgyqmvbu(nufgyqmvbuVar, locale));
        return this.f31479zoijcleaow.get(entryGxszxtbevo);
    }

    private String gtknphoqwx(int i13, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i13) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i13) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i13) : str.substring(0, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map.Entry gxszxtbevo(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private static zoijcleaow lqeggnwhkg(Map map) {
        map.put(dxjokdxxww.FULL_STANDALONE, map.get(dxjokdxxww.FULL));
        map.put(dxjokdxxww.SHORT_STANDALONE, map.get(dxjokdxxww.SHORT));
        dxjokdxxww dxjokdxxwwVar = dxjokdxxww.NARROW;
        if (map.containsKey(dxjokdxxwwVar)) {
            dxjokdxxww dxjokdxxwwVar2 = dxjokdxxww.NARROW_STANDALONE;
            if (!map.containsKey(dxjokdxxwwVar2)) {
                map.put(dxjokdxxwwVar2, map.get(dxjokdxxwwVar));
            }
        }
        return new zoijcleaow(map);
    }

    private Object nufgyqmvbu(gm.nufgyqmvbu nufgyqmvbuVar, Locale locale) {
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37830ntlheqmsrt) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map = new HashMap();
            String[] months = dateFormatSymbols.getMonths();
            HashMap map2 = new HashMap();
            map2.put(1L, months[0]);
            map2.put(2L, months[1]);
            map2.put(3L, months[2]);
            map2.put(4L, months[3]);
            map2.put(5L, months[4]);
            map2.put(6L, months[5]);
            map2.put(7L, months[6]);
            map2.put(8L, months[7]);
            map2.put(9L, months[8]);
            map2.put(10L, months[9]);
            map2.put(11L, months[10]);
            map2.put(12L, months[11]);
            map.put(dxjokdxxww.FULL, map2);
            HashMap map3 = new HashMap();
            map3.put(1L, gtknphoqwx(1, months[0], locale));
            map3.put(2L, gtknphoqwx(2, months[1], locale));
            map3.put(3L, gtknphoqwx(3, months[2], locale));
            map3.put(4L, gtknphoqwx(4, months[3], locale));
            map3.put(5L, gtknphoqwx(5, months[4], locale));
            map3.put(6L, gtknphoqwx(6, months[5], locale));
            map3.put(7L, gtknphoqwx(7, months[6], locale));
            map3.put(8L, gtknphoqwx(8, months[7], locale));
            map3.put(9L, gtknphoqwx(9, months[8], locale));
            map3.put(10L, gtknphoqwx(10, months[9], locale));
            map3.put(11L, gtknphoqwx(11, months[10], locale));
            map3.put(12L, gtknphoqwx(12, months[11], locale));
            map.put(dxjokdxxww.NARROW, map3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap map4 = new HashMap();
            map4.put(1L, shortMonths[0]);
            map4.put(2L, shortMonths[1]);
            map4.put(3L, shortMonths[2]);
            map4.put(4L, shortMonths[3]);
            map4.put(5L, shortMonths[4]);
            map4.put(6L, shortMonths[5]);
            map4.put(7L, shortMonths[6]);
            map4.put(8L, shortMonths[7]);
            map4.put(9L, shortMonths[8]);
            map4.put(10L, shortMonths[9]);
            map4.put(11L, shortMonths[10]);
            map4.put(12L, shortMonths[11]);
            map.put(dxjokdxxww.SHORT, map4);
            return lqeggnwhkg(map);
        }
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37820hkdspvbjdz) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map5 = new HashMap();
            String[] weekdays = dateFormatSymbols2.getWeekdays();
            HashMap map6 = new HashMap();
            map6.put(1L, weekdays[2]);
            map6.put(2L, weekdays[3]);
            map6.put(3L, weekdays[4]);
            map6.put(4L, weekdays[5]);
            map6.put(5L, weekdays[6]);
            map6.put(6L, weekdays[7]);
            map6.put(7L, weekdays[1]);
            map5.put(dxjokdxxww.FULL, map6);
            HashMap map7 = new HashMap();
            map7.put(1L, btonecajqb(1, weekdays[2], locale));
            map7.put(2L, btonecajqb(2, weekdays[3], locale));
            map7.put(3L, btonecajqb(3, weekdays[4], locale));
            map7.put(4L, btonecajqb(4, weekdays[5], locale));
            map7.put(5L, btonecajqb(5, weekdays[6], locale));
            map7.put(6L, btonecajqb(6, weekdays[7], locale));
            map7.put(7L, btonecajqb(7, weekdays[1], locale));
            map5.put(dxjokdxxww.NARROW, map7);
            String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
            HashMap map8 = new HashMap();
            map8.put(1L, shortWeekdays[2]);
            map8.put(2L, shortWeekdays[3]);
            map8.put(3L, shortWeekdays[4]);
            map8.put(4L, shortWeekdays[5]);
            map8.put(5L, shortWeekdays[6]);
            map8.put(6L, shortWeekdays[7]);
            map8.put(7L, shortWeekdays[1]);
            map5.put(dxjokdxxww.SHORT, map8);
            return lqeggnwhkg(map5);
        }
        if (nufgyqmvbuVar == gm.iobyxmoadg.f37825jpowsppfya) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap map9 = new HashMap();
            String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
            HashMap map10 = new HashMap();
            map10.put(0L, amPmStrings[0]);
            map10.put(1L, amPmStrings[1]);
            map9.put(dxjokdxxww.FULL, map10);
            map9.put(dxjokdxxww.SHORT, map10);
            return lqeggnwhkg(map9);
        }
        if (nufgyqmvbuVar != gm.iobyxmoadg.f37824jlmebxxoox) {
            if (nufgyqmvbuVar != gm.ppxfxbqfkf.f37855zoijcleaow) {
                return "";
            }
            HashMap map11 = new HashMap();
            HashMap map12 = new HashMap();
            map12.put(1L, "Q1");
            map12.put(2L, "Q2");
            map12.put(3L, "Q3");
            map12.put(4L, "Q4");
            map11.put(dxjokdxxww.SHORT, map12);
            HashMap map13 = new HashMap();
            map13.put(1L, "1st quarter");
            map13.put(2L, "2nd quarter");
            map13.put(3L, "3rd quarter");
            map13.put(4L, "4th quarter");
            map11.put(dxjokdxxww.FULL, map13);
            return lqeggnwhkg(map11);
        }
        DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
        HashMap map14 = new HashMap();
        String[] eras = dateFormatSymbols4.getEras();
        HashMap map15 = new HashMap();
        map15.put(0L, eras[0]);
        map15.put(1L, eras[1]);
        map14.put(dxjokdxxww.SHORT, map15);
        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            HashMap map16 = new HashMap();
            map16.put(0L, "Before Christ");
            map16.put(1L, "Anno Domini");
            map14.put(dxjokdxxww.FULL, map16);
        } else {
            map14.put(dxjokdxxww.FULL, map15);
        }
        HashMap map17 = new HashMap();
        map17.put(0L, eras[0].substring(0, 1));
        map17.put(1L, eras[1].substring(0, 1));
        map14.put(dxjokdxxww.NARROW, map17);
        return lqeggnwhkg(map14);
    }

    @Override // em.wkgbmnqykc
    public String ppxfxbqfkf(gm.nufgyqmvbu nufgyqmvbuVar, long j13, dxjokdxxww dxjokdxxwwVar, Locale locale) {
        Object objDxjokdxxww = dxjokdxxww(nufgyqmvbuVar, locale);
        if (objDxjokdxxww instanceof zoijcleaow) {
            return ((zoijcleaow) objDxjokdxxww).iobyxmoadg(j13, dxjokdxxwwVar);
        }
        return null;
    }
}
