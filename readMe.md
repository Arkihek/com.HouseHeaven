# com.HauseHeaven
### Örnek Read Me Dosyası
### 
***
1. Clas isimlendirmesi US_001 seklinde olmali

2. Locate alinan element nerenin elementi oldugu aciklama satiri ile aciklanmali || orn: Homepage>> LoginLink>> Email Text Box ||

3. Projede yapilacak her adim ingilizce yapilmalidir calsimalar turkce yapilsa dahil push yapilmadan once ingilizceye cevirilmelidir (google translate ile cevirilebilir)

      <br/>
   
### Git
***
1. Herkes kendi adina birer branch olusturur.
    * `git branch <isim>`
      
2. branch degisikligi yaparken terminalde:
    * `git checkout <isim>`
    * veya 
    * git checkout main seklinde gecis yapilir
   
      
3. Yaptigi degisiklikleri kucuk commitlerle kendi branchinda saklar. Burada tavsiye edilen sadece sizin yaptiginiz degisikliklerin eklenmesidir.
    * 'git add . kesinlikle kullanilMAMAli'
    * 'git add (degisiklik yapilan yerin  dosya yolu yani "pat from content root" u)
    * 'git commit -m "İsim/v(kacinci version)/Tarih"'
      Örn >>> git commit -m "<ihsan/v1/25.07"
4. git push
   
5. gelen linkten ustteki linke tiklanir ve github hesabi sayfasi acilir
 
6. Push ettigimiz kendi kodumuz icin **request** olusturulur ve is biter
  
7. Merge request islemi team lead tarfindan gerceklestirilir

8. Requestleri kabul edilen projenin kendi projeemize aktarmak icin:
* Main branchine gecilir
* git pull edilir
* kendi branchimize gecilir
* git checkout <isim> 
* git merge main yazilir.



### Isimlendirmelerde dikaat edilecekler
***
| Element Türü   | Variable name |
|----------------|--------------|
| Button         | signInButton |    
| Logo           | logoX         |
| icon           | iconX        |
| Sadece text    | labelX       |
| Drop down      | dropDownX    |
| Radio Button   | radioButtonX |
| Check box      | checkBoxX    |
| Tablo Sütünu   | columnX      |
| Tablo Satiri   | rowX         |
| Kisi Resimleri | imageProfileX |
| ürün resimleri | imageProductX |
| Linkler        | linkX        |