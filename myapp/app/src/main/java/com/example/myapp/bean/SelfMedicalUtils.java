package com.example.myapp.bean;

import com.example.myapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Author zhangdongwei
 */
public class SelfMedicalUtils {
    public static String[] food = {   "头孢拉定 ", "环丙沙星", "吗丁啉",
            "健胃消食片", "泻立停", "氟哌酸", "扑尔敏片", "息斯敏", "乙醇", "碘酒", "高锰酸钾", "茶苯海明", "创可贴", "纱布"};
    public static String[] food1 = { "抗菌药物", "抗菌药物 ", "助消化药", "助消化药",
            "止泻药", "止泻药 ", "抗过敏药", "抗过敏药",
            "外用消毒药", "外用消毒药", "外用消毒药", "晕动药", "其他", "其他"};
    public static int[] resId = {
            R.mipmap.egg, R.mipmap.carp, R.mipmap.yellowfish,
            R.mipmap.shrimp, R.mipmap.shrimp2, R.mipmap.crab,
            R.mipmap.clam, R.mipmap.turtle, R.mipmap.riversnail,
            R.mipmap.garlic, R.mipmap.onion, R.mipmap.radish,
            R.mipmap.celery, R.mipmap.leek };
    public static String [] foodjianjie={
            "头孢拉定 （Cephradine, Velosef） 别名：先锋霉素Ⅵ、头孢菌素Ⅵ等。本品为第一代半合成头孢菌素，抗菌作用与头孢氨苄相似。本品耐酸可以口服，吸收好，血药浓度较高，特点是耐β内酰胺酶，对耐药性金葡菌及其它多种对广谱抗生素耐药的杆菌等有迅速而可靠的杀菌作用，主要以原形经尿排泄，尿中浓度较高。",
            "环丙沙星为合成的第三代喹诺酮类抗菌药物，具广谱抗菌活性，杀菌效果好，几乎对所有细菌的抗菌活性均较诺氟沙星及依诺沙星强2～4倍，对肠杆菌、绿脓杆菌、流感嗜血杆菌、淋球菌、链球菌、军团菌、金黄色葡萄球菌具有抗菌作用。",
            "吗丁啉(多潘立酮片)治疗由胃排空延缓、胃食道反流、食道炎引起的消化不良症。-上腹部胀闷感、腹胀、上腹疼痛；-暧气、肠胃胀气；-恶心、呕吐；-口中带有或不带有反流胃内容物的胃烧灼感。",
            "健胃消食片，中成药名。为消食剂，具有健胃消食之功效。主治脾胃虚弱所致的食积，症见不思饮食，嗳腐酸臭，脘腹胀满；消化不良见上述证候者。",
            "泻立停，即颠茄磺苄啶片，为类白色片，为复方制剂，含活性成份磺胺甲恶唑、甲氧苄啶、颠茄流浸膏。常用于治疗痢疾杆菌引起的慢性菌痢和其他敏感致病菌引起的肠炎等。",
            "氟哌酸又名诺氟沙星（Norfloxacin），为第三代喹诺酮类抗菌药，会阻碍消化道内致病细菌的DNA旋转酶（DNA Gyrase）的作用，阻碍细菌DNA复制，对细菌有抑制作用，是治疗肠炎痢疾的常用药。但此药对未成年人骨骼形成有延缓作用，会影响到发育，故禁止未成年人服用。",
            "扑尔敏片即马来酸氯苯那敏片，白色片剂，适用于皮肤过敏症：荨麻疹，湿疹，皮炎，药疹，皮肤瘙痒症，神经性皮炎，虫咬症，日光性皮炎，也可用于过敏性鼻炎，药物及食物过敏。主要不良反应为嗜睡、口渴、多尿、咽喉痛、困倦、虚弱感、心悸、皮肤瘀斑、出血倾向。",
            "息斯敏（氯雷他定片），适应症为本品用于治疗常年性和季节性过敏性鼻炎、过敏性结膜炎、慢性荨麻疹和其他过敏性反应症状及体征。",
            "乙醇在常温常压下是一种易燃、易挥发的无色透明液体，低毒性，纯液体不可直接饮用；具有特殊香味，并略带刺激；微甘，并伴有刺激的辛辣滋味。易燃，其蒸气能与空气形成爆炸性混合物，能与水以任意比互溶。能与氯仿、乙醚、甲醇、丙酮和其他多数有机溶剂混溶。",
            "碘酊又称为碘酒，为红棕色的液体，主要成分为碘、碘化钾。有碘与乙醇特臭。色泽随浓度增加而变深。适应症为用于皮肤感染和消毒。许多人认为碘酒只是打针或手术前消毒皮肤用的，其实这只是碘酒的用途之一。在日常生活中，碘酒可以用来治疗许多小毛病。",
            "高锰酸钾（Potassium permanganate）是一种强氧化剂，为黑紫色、细长的棱形结晶或颗粒，带蓝色的金属光泽，无臭，与某些有机物或易氧化物接触，易发生爆炸，溶于水、碱液，微溶于甲醇、丙酮、硫酸，分子式为KMnO4，分子量为158.034。熔点为240°C，但接触易燃材料可能引起火灾。",
            "茶苯海明本品为白色结晶性粉末；无臭。化学名为1,3-二甲基-8- 氯-3，7-二氢-1H-嘌呤-2，6-二酮-N，N-二甲基-2-（二苯基氧基）乙胺盐。按干燥品计算，含苯海拉明（C17H21NO）应为53.0%～55.5%。微溶于水，易溶于乙醇，难溶于苯及乙醚，见光色泽逐渐变深。是一种抗组胺类西药。",
            "创可贴是一长形胶布，中间附以浸过药物的纱布，用来贴在创口处从而起保护伤口，暂时止血，抵抗细菌再生，防止创口再次损伤的作用  。是医院、诊所、家庭中最常用的急救必备医疗用品。",
            "纱布，是一种经纬稀疏的棉织品。属纺织原料，布类，特点是稀疏，有明显的网格。纯棉纱布（也作全棉纱布），主要用于棉被、蚕丝被里料，包棉胎。也可脱脂后医用，上浆定型后工业用。"};



    public static List<MedicineBean> getAllFoodList(){
        List<MedicineBean>list=new ArrayList<>();
        for(int i=0;i<food.length;i++){
            MedicineBean bean=new MedicineBean(food[i],food1[i],foodjianjie[i],resId[i]);
            list.add(bean);
        }
        return list;
    }
}
