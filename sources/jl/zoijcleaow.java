package jl;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jose4j.json.internal.json_simple.parser.ParseException;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private LinkedList f51683iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ppxfxbqfkf f51686zoijcleaow = new ppxfxbqfkf(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private wkgbmnqykc f51684ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f51685wkgbmnqykc = 0;

    private List iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        List listZoijcleaow;
        return (iobyxmoadgVar == null || (listZoijcleaow = iobyxmoadgVar.zoijcleaow()) == null) ? new il.iobyxmoadg() : listZoijcleaow;
    }

    private int lqeggnwhkg(LinkedList linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        return ((Integer) linkedList.getFirst()).intValue();
    }

    private void wkgbmnqykc() throws ParseException, IOException {
        wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = this.f51686zoijcleaow.wkgbmnqykc();
        this.f51684ppxfxbqfkf = wkgbmnqykcVarWkgbmnqykc;
        if (wkgbmnqykcVarWkgbmnqykc == null) {
            this.f51684ppxfxbqfkf = new wkgbmnqykc(-1, null);
        }
    }

    private Map zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        Map mapIobyxmoadg;
        return (iobyxmoadgVar == null || (mapIobyxmoadg = iobyxmoadgVar.iobyxmoadg()) == null) ? new il.ppxfxbqfkf() : mapIobyxmoadg;
    }

    public void dxjokdxxww(Reader reader) {
        this.f51686zoijcleaow.eablkybsjg(reader);
        nufgyqmvbu();
    }

    public Object eablkybsjg(Reader reader, iobyxmoadg iobyxmoadgVar) throws ParseException, IOException {
        dxjokdxxww(reader);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        do {
            wkgbmnqykc();
            int i13 = this.f51685wkgbmnqykc;
            if (i13 == -1) {
                throw new ParseException(ppxfxbqfkf(), 1, this.f51684ppxfxbqfkf);
            }
            if (i13 == 0) {
                int i14 = this.f51684ppxfxbqfkf.f51681iobyxmoadg;
                if (i14 == 0) {
                    this.f51685wkgbmnqykc = 1;
                    linkedList.addFirst(1);
                    linkedList2.addFirst(this.f51684ppxfxbqfkf.f51682zoijcleaow);
                } else if (i14 == 1) {
                    this.f51685wkgbmnqykc = 2;
                    linkedList.addFirst(2);
                    linkedList2.addFirst(zoijcleaow(iobyxmoadgVar));
                } else if (i14 != 3) {
                    this.f51685wkgbmnqykc = -1;
                } else {
                    this.f51685wkgbmnqykc = 3;
                    linkedList.addFirst(3);
                    linkedList2.addFirst(iobyxmoadg(iobyxmoadgVar));
                }
            } else {
                if (i13 == 1) {
                    if (this.f51684ppxfxbqfkf.f51681iobyxmoadg == -1) {
                        return linkedList2.removeFirst();
                    }
                    throw new ParseException(ppxfxbqfkf(), 1, this.f51684ppxfxbqfkf);
                }
                if (i13 == 2) {
                    wkgbmnqykc wkgbmnqykcVar = this.f51684ppxfxbqfkf;
                    int i15 = wkgbmnqykcVar.f51681iobyxmoadg;
                    if (i15 == 0) {
                        Object obj = wkgbmnqykcVar.f51682zoijcleaow;
                        if (obj instanceof String) {
                            linkedList2.addFirst((String) obj);
                            this.f51685wkgbmnqykc = 4;
                            linkedList.addFirst(4);
                        } else {
                            this.f51685wkgbmnqykc = -1;
                        }
                    } else if (i15 != 2) {
                        if (i15 != 5) {
                            this.f51685wkgbmnqykc = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.f51685wkgbmnqykc = lqeggnwhkg(linkedList);
                    } else {
                        this.f51685wkgbmnqykc = 1;
                    }
                } else if (i13 == 3) {
                    int i16 = this.f51684ppxfxbqfkf.f51681iobyxmoadg;
                    if (i16 == 0) {
                        ((List) linkedList2.getFirst()).add(this.f51684ppxfxbqfkf.f51682zoijcleaow);
                    } else if (i16 == 1) {
                        List list = (List) linkedList2.getFirst();
                        Map mapZoijcleaow = zoijcleaow(iobyxmoadgVar);
                        list.add(mapZoijcleaow);
                        this.f51685wkgbmnqykc = 2;
                        linkedList.addFirst(2);
                        linkedList2.addFirst(mapZoijcleaow);
                    } else if (i16 == 3) {
                        List list2 = (List) linkedList2.getFirst();
                        List listIobyxmoadg = iobyxmoadg(iobyxmoadgVar);
                        list2.add(listIobyxmoadg);
                        this.f51685wkgbmnqykc = 3;
                        linkedList.addFirst(3);
                        linkedList2.addFirst(listIobyxmoadg);
                    } else if (i16 != 4) {
                        if (i16 != 5) {
                            this.f51685wkgbmnqykc = -1;
                        }
                    } else if (linkedList2.size() > 1) {
                        linkedList.removeFirst();
                        linkedList2.removeFirst();
                        this.f51685wkgbmnqykc = lqeggnwhkg(linkedList);
                    } else {
                        this.f51685wkgbmnqykc = 1;
                    }
                } else if (i13 == 4) {
                    int i17 = this.f51684ppxfxbqfkf.f51681iobyxmoadg;
                    if (i17 == 0) {
                        linkedList.removeFirst();
                        ((Map) linkedList2.getFirst()).put((String) linkedList2.removeFirst(), this.f51684ppxfxbqfkf.f51682zoijcleaow);
                        this.f51685wkgbmnqykc = lqeggnwhkg(linkedList);
                    } else if (i17 == 1) {
                        linkedList.removeFirst();
                        String str = (String) linkedList2.removeFirst();
                        Map map = (Map) linkedList2.getFirst();
                        Map mapZoijcleaow2 = zoijcleaow(iobyxmoadgVar);
                        map.put(str, mapZoijcleaow2);
                        this.f51685wkgbmnqykc = 2;
                        linkedList.addFirst(2);
                        linkedList2.addFirst(mapZoijcleaow2);
                    } else if (i17 == 3) {
                        linkedList.removeFirst();
                        String str2 = (String) linkedList2.removeFirst();
                        Map map2 = (Map) linkedList2.getFirst();
                        List listIobyxmoadg2 = iobyxmoadg(iobyxmoadgVar);
                        map2.put(str2, listIobyxmoadg2);
                        this.f51685wkgbmnqykc = 3;
                        linkedList.addFirst(3);
                        linkedList2.addFirst(listIobyxmoadg2);
                    } else if (i17 != 6) {
                        this.f51685wkgbmnqykc = -1;
                    }
                }
            }
            if (this.f51685wkgbmnqykc == -1) {
                throw new ParseException(ppxfxbqfkf(), 1, this.f51684ppxfxbqfkf);
            }
        } while (this.f51684ppxfxbqfkf.f51681iobyxmoadg != -1);
        throw new ParseException(ppxfxbqfkf(), 1, this.f51684ppxfxbqfkf);
    }

    public Object gxszxtbevo(String str, iobyxmoadg iobyxmoadgVar) {
        try {
            return eablkybsjg(new StringReader(str), iobyxmoadgVar);
        } catch (IOException e13) {
            throw new ParseException(-1, 2, e13);
        }
    }

    public void nufgyqmvbu() {
        this.f51684ppxfxbqfkf = null;
        this.f51685wkgbmnqykc = 0;
        this.f51683iobyxmoadg = null;
    }

    public int ppxfxbqfkf() {
        return this.f51686zoijcleaow.iobyxmoadg();
    }
}
