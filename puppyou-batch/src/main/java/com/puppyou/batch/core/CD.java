package com.puppyou.batch.core;

import com.puppyou.batch.core.util.EnumMapperType;

public class CD {
	

	public enum BirthHiddenYn {
		Y, N;
	}
	
	public enum Gender implements EnumMapperType{
		M("남"), 
		F("여");
		
		private String label;
		
		Gender(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }

		@Override
		public String getLabel() { return label; }
		
	    public static String getGender(String code) {
	        for (Gender gender : Gender.values()) {
	            if (code.equals(gender.getCode())) {
	                return gender.getLabel();
	            }
	        }
	        return null;
	    }
	}

	public enum Grade implements EnumMapperType {
		NORMAL("일반회원"), 
		VIP("우수회원"),
		VVIP("최우수회원")
		;
		
		private String label;
		
		Grade(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }
		
		@Override
		public String getLabel() { return label; }
		
		public static String getGrade(String code) {
			for (Grade grade : Grade.values()) {
				if (code.equals(grade.getCode())) {
					return grade.getLabel();
				}
			}
			return null;
		}
	}
	
	public enum MatchStatus implements EnumMapperType{
		NO_MATCH("매칭 없음"), 
		GOING("가는 중"),
		MATCHING("매칭 중"),
		CANCEL("취소"),
		END("종료")
		;
		
		private String label;
		
		MatchStatus(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }
		
		@Override
		public String getLabel() { return label; }
		
		public static String getMatchStatus(String code) {
			for (MatchStatus status : MatchStatus.values()) {
				if (code.equals(status.getCode())) {
					return status.getLabel();
				}
			}
			return null;
		}
	}
	
	public enum BusinessCd implements EnumMapperType{
		TEST("테스트상점"), 
		TEST_SANSUNG("(주)테스트삼성")
		;
		
		private String label;
		
		BusinessCd(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }
		
		@Override
		public String getLabel() { return label; }
		
		public static String getBusinessCd(String code) {
			for (BusinessCd status : BusinessCd.values()) {
				if (code.equals(status.getCode())) {
					return status.getLabel();
				}
			}
			return null;
		}
	}
	
    public enum ActivationYn {
        Y, N;
    }
    
    public enum NotificationYn {
		Y, N;
	}
	
	public enum MarketingYn {
		Y, N;
	}
	
	public enum TermsYn {
		Y, N;
	}
    
    public enum ProgressStatus implements EnumMapperType {
    	ING("진행중"),
    	END("종료");
    	
    	private String label;
    	
    	ProgressStatus(String label) { this.label = label; }
    	
    	@Override
    	public String getCode() { return name(); }
    	
    	@Override
    	public String getLabel() { return label; }
    	
    	public static String getProgressStatus(String code) {
    		for (ProgressStatus status : ProgressStatus.values()) {
    			if (code.equals(status.getCode())) {
    				return status.getLabel();
    			}
    		}
    		return null;
    	}
    }
    
	public enum PostType implements EnumMapperType {
		N("일반"),
		L("위치");
		
		private String label;
		
		PostType(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }

		@Override
		public String getLabel() { return label; }
		
	    public static String getPostType(String code) {
	        for (PostType type : PostType.values()) {
	            if (code.equals(type.getCode())) {
	                return type.getLabel();
	            }
	        }
	        return null;
	    }
	}
	
	public enum DeleteYn {
		Y, N;
	}
	
	public enum SympathyType {
		U, D;
	}
	
	public enum BoneType implements EnumMapperType {
		JOIN("가입"),
		MATCHING("매칭"),
		MATCHING_REVIEW("매칭 후기"),
		PRODUCT_REVIEW("상품 후기"),
		CHARGE("충전"),
		BUY("상품 구매"),
		ETC("기타")
		;
		
		private String label;
		
		BoneType(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }

		@Override
		public String getLabel() { return label; }
		
	    public static String getBoneType(String code) {
	        for (BoneType type : BoneType.values()) {
	            if (code.equals(type.getCode())) {
	                return type.getLabel();
	            }
	        }
	        return null;
	    }
	}
	
	public enum EventType implements EnumMapperType {
		FIRST_MATCHING("첫 매칭")
		;
		
		private String label;
		
		EventType(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }
		
		@Override
		public String getLabel() { return label; }
		
		public static String getBoneType(String code) {
			for (EventType type : EventType.values()) {
				if (code.equals(type.getCode())) {
					return type.getLabel();
				}
			}
			return null;
		}
	}
	
	public enum ReviewYn {
		Y, N;
	}
	
	public enum ImageType {
		MEMBER_PROFILE,	
		MEMBER_THUMBNAIL,
		PUPPY_PROFILE,	
		PUPPY_THUMBNAIL,
		POST,
		MATCHING_REVIEW,
		PRODUCT_REVIEW,
		PRODUCT,
		PRODUCT_DETAIL,
		BANNER_ORIGIN, 
		BANNER_THUMBNAIL
		;
	}
	
	public enum FileType {
		NOTICE_DETAIL, 
		NOTICE_THUMBNAIL, 
		EVENT_THUMBNAIL,
		VIDEO,
		FILE
		;
	}
	
	
	public enum NoticeType {
		NOTICE, EVENT, QNA;
	}
    
    public enum PushYn{
    	Y, N;
    }
    
    public enum ProcessingYn{
    	Y, N;
    }
    
    public enum MainYn{
    	Y, N;
    }
    
    public enum NeutralizationYn{
    	Y, N;
    }
    
    public enum ScrapType implements EnumMapperType {
    	C("커뮤니티"), 
    	P("게시글"),
    	R("최근퍼피"),
    	I("관심퍼피");
    	
    	private String label;
		
    	ScrapType(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }

		@Override
		public String getLabel() { return label; }
		
	    public static String getScrapType(String code) {
	        for (ScrapType type : ScrapType.values()) {
	            if (code.equals(type.getCode())) {
	                return type.getLabel();
	            }
	        }
	        return null;
	    }
    }
    
    public enum ReportType implements EnumMapperType {
    	CHAT("채팅"), 
    	POST("게시글");
    	
    	private String label;
    	
    	ReportType(String label) { this.label = label; }
    	
    	@Override
    	public String getCode() { return name(); }
    	
    	@Override
    	public String getLabel() { return label; }
    	
    	public static String getReportType(String code) {
    		for (ReportType type : ReportType.values()) {
    			if (code.equals(type.getCode())) {
    				return type.getLabel();
    			}
    		}
    		return null;
    	}
    }

    
    public enum VaccinationStatus implements EnumMapperType {
    	N("접종 전"), 
    	P("접종 중"), 
    	Y("접종 완료");
    	
    	private String label;
    	
    	VaccinationStatus(String label) { this.label = label; }
    	
    	@Override
    	public String getCode() { return name(); }
    	
    	@Override
    	public String getLabel() { return label; }
    	
    	public static String getVaccinationStatus(String code) {
    		for (ReportType status : ReportType.values()) {
    			if (code.equals(status.getCode())) {
    				return status.getLabel();
    			}
    		}
    		return null;
    	}
    }

   
    public enum BreedType implements EnumMapperType {
		D001("가스코뉴 생통주아"),
		D002("고든 세터"),
		D003("골든 리트리버"),
		D004("그랜드 그리펀 방데"),
		D005("그랜드 바세 그리펀 방데"),
		D006("그레이트 가스코뉴 블루"),
		D007("그레이트 덴"),
		D008("그레이트 스위스 마운틴 독"),
		D009("그레이트 앵글로-프랜치 트라이컬러 하운드"),
		D010("그레이트 앵글로-프랜치 화이트 앤드 블랙 하운드"),
		D011("그레이트 앵글로-프랜치 화이트 앤드 오렌지 하운드"),
		D012("그레이하운드-스페니쉬 그레이하운드"),
		D013("그레이하운드-아라비언 그레이하운드"),
		D014("그레이하운드-이탈리언 그레이하운드"),
		D015("그레이하운드-잉글리시 그레이하운드"),
		D016("그레이하운드-폴리시 그레이하운드"),
		D017("그레이하운드-헝가리언 그레이하운드"),
		D018("그루넨달 (벨지언 세퍼드 독)"),
		D019("그리펀 니베르네"),
		D020("그리퐁 포브 드 브르타뉴 (폰 브리타니 그리폰)"),
		D021("그릭 헤어하운드 (헬레닉 하운드)"),
		D022("그린랜드 독"),
		D023("글렌 오브 이말 테리어"),
		D024("기슈 이뉴 (기슈견, 기쥬견, 기주견)"),
		D025("꼬똥 드 툴레아"),
		D026("낀다마니 (발리 마운틴 독)"),
		D027("네더르란스 쿠이커혼제"),
		D028("네아폴리탄 마스티프"),
		D029("노르망 아르테시앙 바셋"),
		D030("노르보텐 스피츠"),
		D031("노르웨이언 룬트훈트"),
		D032("노르웨이언 부훈트"),
		D033("노르웨이언 엘크 하운드"),
		D034("노르웨이언 하운드"),
		D035("노리치 테리어"),
		D036("노바 스코셔 덕 톨링 리트리버"),
		D037("노퍽 테리어"),
		D038("노폴크 테리어"),
		D039("뉴기니아 싱잉 독"),
		D040("뉴펀들랜드"),
		D041("닥스훈트"),
		D042("달마시안"),
		D043("댄디 딘몬트 테리어"),
		D044("더치 샤펜더스"),
		D045("더치 세퍼드 독"),
		D046("더치 스모우스혼드"),
		D047("데니쉬-스웨디시 팜독"),
		D048("도고 아르헨티노"),
		D049("도그 드 보르도"),
		D050("도베르만 핀셔"),
		D051("도사견"),
		D052("도이치 브라케"),
		D053("도이치 스티첼하르 (저먼 러프헤어드 포인터)"),
		D054("동경견"),
		D055("드레버"),
		D056("드렌츠 파트리지 독"),
		D057("디어하운드"),
		D058("딩고"),
		D059("라사 압소"),
		D060("라이카-러시아-유럽 라이카"),
		D061("라이카-웨스트 시베리안 라이카"),
		D062("라이카-이스트 시베리안 라이카"),
		D063("라지 페루비언 헤어리스 독 (잉카 헤어리스 독)"),
		D064("라케노이즈(벨지언 셰퍼드 독)"),
		D065("라트비안 하운드"),
		D066("라페이로 도 알렌테조 (포르투갈 마스티프)"),
		D067("라포니언 허더"),
		D068("라프훈트"),
		D069("래브라도 리트리버"),
		D070("래브라도 허스키"),
		D071("래빗 닥스훈트"),
		D072("랜시어 (란트저)"),
		D073("랭카셔 힐러"),
		D074("러시안 블랙 테리어"),
		D075("러시안 스파니얼"),
		D076("러시안 유러피언 라이카"),
		D077("러시안 토이 (루스키 토이)"),
		D078("러시안 하운드"),
		D079("러시안 할리퀸 하운드"),
		D080("러프 콜리"),
		D081("레드본 쿤하운드"),
		D082("레온베르거"),
		D083("레이크랜드 테리어"),
		D084("레커누아 (벨지언 세퍼드 독)"),
		D085("렌드시어"),
		D086("로디지언 리지백"),
		D087("로르셀렌"),
		D088("로마냐 워터 독"),
		D089("로트바일러"),
		D090("롱-헤어드 피레니언 쉽독"),
		D091("루마니안 미오리틱 셰퍼드 독"),
		D092("루마니안 카르파티안 셰퍼드 독"),
		D093("르베스크"),
		D094("리투아니안 하운드"),
		D095("리틀 라이언 독 (로첸)"),
		D096("마렘마 쉽독 (아르보초 쉽독)"),
		D097("마르키쉬에"),
		D098("마리노이즈 (벨지언 셰퍼드 독)"),
		D099("마스티프"),
		D100("마요르카 마스티프"),
		D101("마요르카 세퍼드 독"),
		D102("마자르 아가"),
		D103("말리누아(벨지언 세퍼드 독)"),
		D104("말티즈"),
		D105("맨체스터 테리어"),
		D106("머레머 앤드 아브루츠 쉽독"),
		D107("멕시컨 헤어리스 독"),
		D108("모스크바 와치독"),
		D109("몬테네그린 마운틴 하운드"),
		D110("무디"),
		D111("문스터랜더/라지"),
		D112("문스터랜더/스몰"),
		D113("미니어처 닥스훈트"),
		D114("미니어처 슈나우저"),
		D115("미니어처 아메리칸 에스키모 독"),
		D116("미니어처 페루비언 헤어리스 독 (잉카 헤어리스 독)"),
		D117("미니어쳐 푸들"),
		D118("미니어쳐 핀셔"),
		D119("미들 아시안 오브차카 (센트럴 아시안 오브차카, 센트럴 아시아 셰퍼드 독)"),
		D120("미디엄 그리펀 방데"),
		D121("미디엄 페루비언 헤어리스 독 (잉카 헤어리스 독)"),
		D122("미디엄 푸들"),
		D123("믹스견"),
		D124("바르베 (바베트)"),
		D125("바바리언 마운틴 하운드"),
		D126("바센지"),
		D127("바셋 아르테지앙 노르만"),
		D128("바셋 포브 드 브르타뉴"),
		D129("바셋 하운드"),
		D130("바이마라너"),
		D131("버고스 포인팅 독"),
		D132("버니즈 마운틴 독"),
		D133("버센지"),
		D134("베들링턴 테리어"),
		D135("베르가마스코 셰퍼드 독"),
		D136("베르제 피카르 (피카르디 셰퍼드)"),
		D137("베스트펠리셔 닥스브라케"),
		D138("벨지안 그리폰"),
		D139("벨지안 셰퍼드 독 (벨지언 쉽독)"),
		D140("보더 콜리"),
		D141("보더 테리어"),
		D142("보르조이"),
		D143("보비에 드 플란더스"),
		D144("보스니언 콜스-헤어드 하운드"),
		D145("보스롱 (보스쉽독)"),
		D146("보스턴 테리어"),
		D147("보헤미언 와이어-헤어드 포인팅 그리폰"),
		D148("복서"),
		D149("볼러니즈"),
		D150("볼로그네제"),
		D151("볼피노 이탈리아노"),
		D152("부르보네 포인팅 독(스페니쉬 포인터)"),
		D153("부비에 데 아르덴"),
		D154("부비에 데 플랑드르"),
		D155("불 마스티프"),
		D156("불 테리어"),
		D157("불개"),
		D158("불독"),
		D159("브라질리언 테리어"),
		D160("브라코 이탈리아노"),
		D161("브라크 뒤 부르보네"),
		D162("브라크 드 아리에주 (아리에주 포인터)"),
		D163("브라크 드 오베르뉴"),
		D164("브라크 생-제르맹"),
		D165("브라크 프랑세"),
		D166("브로홀머 (대니쉬 마스티프)"),
		D167("브뤼셀 그리펀"),
		D168("브리아드"),
		D169("브리트니"),
		D170("블랙 노르웨이언 엘크하운드"),
		D171("블랙 러시안 테리어"),
		D172("블랙 앤드 탄 쿤하운드"),
		D173("블랙 테리어"),
		D174("블러드하운드"),
		D175("블루 가스코뉴 그리펀"),
		D176("블루 가스코뉴 바셋"),
		D177("블루 피카르디 스패니얼"),
		D178("블루틱 쿤하운드"),
		D179("비글"),
		D180("비글 해리어"),
		D181("비숑 프리제"),
		D182("비어디드 콜리"),
		D183("비즐라 (헝가리안 숏 헤어드 포인터)"),
		D184("빌리"),
		D185("빠삐용 (파피용)"),
		D186("뽀흐슬렌"),
		D187("뿌아뚜방"),
		D188("쁘띠 바셋 그리폰 벤딘"),
		D189("사를로스 울프독 (사를로스 울프 하운드)"),
		D190("사모예드"),
		D191("사부에소 에소파뇰"),
		D192("사우스 러시안 오브차카 (사우스 러시안 셰퍼드 독)"),
		D193("사우스 러시언 세퍼드 독"),
		D194("사우스이스턴 유러피언 셰퍼드 (부코비나 셰퍼드 독)"),
		D195("살루키"),
		D196("삽살개"),
		D197("샤 페이"),
		D198("샤펜도스"),
		D199("서식스 스패니얼"),
		D200("세라 다 에스트렐라 마운틴 독"),
		D201("세르비안 하운드"),
		D202("세르비언 트라이컬러 하운드"),
		D203("세인트 미구엘 캐틀 독"),
		D204("세인트 버나드 독"),
		D205("세인트 저메인 포인터"),
		D206("센트럴 아시아 세퍼드 독"),
		D207("셔틀랜드 쉽독"),
		D208("소프트 코티드 휘튼 테리어"),
		D209("숄로이츠퀸들"),
		D210("슈나우저/미니어처 슈나우저"),
		D211("슈나우저/스텐다드 슈나우저"),
		D212("슈나우저/자이언트 슈나우저"),
		D213("스말랜드 하운드"),
		D214("스몰 가스콩 블루"),
		D215("스몰 문스터랜더"),
		D216("스웨디시 다츠브라케"),
		D217("스웨디시 라프훈트 (스벤스크 랍훈드)"),
		D218("스웨디시 발훈트 (바스코타 스펫츠)"),
		D219("스웨디시 엘크하운드"),
		D220("스위스 숏 레그드 하운드"),
		D221("스위스 하운드 (슈바이처 라우프훈트)"),
		D222("스첼스퇴바레"),
		D223("스칠러 하운드"),
		D224("스카이 테리어"),
		D225("스코티쉬 테리어"),
		D226("스키퍼키"),
		D227("스타베이 (스타비훈)"),
		D228("스타이리안 콜스 헤어드 하운드"),
		D229("스타포드셔 불 테리어"),
		D230("스탠다드 슈나우저"),
		D231("스탠다드 아메리칸 에스키모 독"),
		D232("스탠다드 푸들"),
		D233("스탠다드 핀셔 (저먼 핀셔)"),
		D234("스트렐루프 스퇴바레"),
		D235("스페니시 그랜드하운드 (갈고 에스파뇨르)"),
		D236("스페니시 마스티프"),
		D237("스페니시 워터 독"),
		D238("스페니시 하운드"),
		D239("스피노네 이탈리아노"),
		D240("슬로바키안 슈바시"),
		D241("슬로바키안 와이어헤어드 포인터"),
		D242("슬로바키안 쿠바츠 (슬로바키안 큐바크)"),
		D243("슬로바키안 하운드"),
		D244("슬루기"),
		D245("시르네코 델레트나"),
		D246("시바견"),
		D247("시베리안 허스키"),
		D248("시츄"),
		D249("시코꾸"),
		D250("실리햄 테리어"),
		D251("실키 테리어 (오스트레일리안 실키 테리어)"),
		D252("아나톨리안 세퍼드 독 (아나톨리안 카라바시 독)"),
		D253("아데네스 케틀 독"),
		D254("아르토이스 하운드 (시앙 드 아르토이스)"),
		D255("아르투아 하운드"),
		D256("아리에주아 (아리에주 하운드)"),
		D257("아리제 포인팅 독"),
		D258("아리제 하운드"),
		D259("아메리칸 불리"),
		D260("아메리칸 블독"),
		D261("아메리칸 스태포드셔 테리어"),
		D262("아메리칸 워터 스패니얼"),
		D263("아메리칸 코커 스패니얼"),
		D264("아메리칸 코커 스패니얼 버프"),
		D265("아메리칸 폭스 하운드"),
		D266("아메리칸 핏불 테리어"),
		D267("아메리컨 아키타"),
		D268("아이리시 글랜 이말 테리어"),
		D269("아이리시 레드 앤드 화이트 세터"),
		D270("아이리시 세터 (아이리시 레드 세터)"),
		D271("아이리시 소프트코티드 휘튼 테리어"),
		D272("아이리시 울프하운드"),
		D273("아이리시 워터 스패니얼"),
		D274("아이리시 테리어"),
		D275("아이슬랜딕 쉽독 (아이스란드 독)"),
		D276("아자와크"),
		D277("아크바시 독"),
		D278("아키타"),
		D279("아틀라스 마운틴 독 (아이디)"),
		D280("아펜첼러 제네훈트 (아펜젤 케들 독)"),
		D281("아펜핀셔"),
		D282("아프간 하운드"),
		D283("알래스칸 맬러뮤트"),
		D284("알렌테주 마스티프"),
		D285("알파인 닥스브라케"),
		D286("앙글로 프랑세 드 프티 베느리"),
		D287("에스토니아 하운드"),
		D288("에스트렐라 마운틴독"),
		D289("에어데일 테리어"),
		D290("엔틀레부흐 케틀 독 (엔틀레부허 제넨훈트)"),
		D291("엥글로 프렌치 하운드"),
		D292("옘툰드 (쟘툰드)"),
		D293("오베르뉴 포인팅 독"),
		D294("오수견"),
		D295("오스트랄리안 캐틀 독"),
		D296("오스트랄리안 켈피"),
		D297("오스트랄리안 테리어"),
		D298("오스트레일리안 셰퍼드"),
		D299("오스트레일리안 실키 테리어"),
		D300("오스트리안 블랙 앤드 탄 하운드 (브랜들브라케, 피로이글)"),
		D301("오스트리안 핀셔"),
		D302("오터하운드"),
		D303("올드 데니시 포인팅 독 (올드 대니쉬 버드 독)"),
		D304("올드 잉글리시 쉽독"),
		D305("와이마라너"),
		D306("와이어 폭스 테리어"),
		D307("와이어 헤어드 비즐라"),
		D308("와이어헤어드 슬로바키언 포인터"),
		D309("와이어헤어드 포인팅 그리폰"),
		D310("완도견"),
		D311("요크셔 테리어"),
		D312("우르과이안 시마론 (페로 시마론 우루과요)"),
		D313("웨스트 시베리안 라이카"),
		D314("웨스트 팔리안 탁스브라케"),
		D315("웨스트 하이랜드 화이트 테리어"),
		D316("웨스트팔리안 닥스브라케"),
		D317("웨터훈 (베테르하운) (프리지안 워터독)"),
		D318("웰시 스프링어 스패니얼"),
		D319("웰시 코기 카디건"),
		D320("웰시 코기 펨브로크"),
		D321("웰시 테리어"),
		D322("유고슬라비안 하운드"),
		D323("유고슬라비언 세퍼드 독 (샤플라니낙)"),
		D324("유라시안 (유라시어)"),
		D325("이비잔 하운드 (포덴코 이비센코)"),
		D326("이스트 러시안 코오싱 하운드"),
		D327("이스트리안 쇼트-헤어드 하운드"),
		D328("이스트리안 와이어 헤어드 하운드"),
		D329("이스트리안 콜스-헤어드 하운드"),
		D330("이탈리안 그레이드하운드"),
		D331("이탈리안 숏 헤어드 세구지오"),
		D332("이탈리안 스피노네"),
		D333("이탈리안 와이어 헤어드 세구지오"),
		D334("이탈리안 코로소 독"),
		D335("이탈리안 포인팅 독"),
		D336("이탈리안 하운드/쇼트-헤어드"),
		D337("이탈리안 하운드/콜스-헤어드"),
		D338("잉글리쉬 포인터"),
		D339("잉글리시 마스티프"),
		D340("잉글리시 세터"),
		D341("잉글리시 세퍼드"),
		D342("잉글리시 스프링어 스패니얼"),
		D343("잉글리시 코커 스패니얼"),
		D344("잉글리시 쿤하운드"),
		D345("잉글리시 토이 스패니얼 (킹 찰스 스패니얼)"),
		D346("잉글리시 토이 테리어"),
		D347("잉글리시 폭스하운드"),
		D348("자이언트 슈니우저"),
		D349("잭 러셀 테리어"),
		D350("저먼 롱헤어드 포인터 (도이치 링하어)"),
		D351("저먼 세퍼드 독"),
		D352("저먼 쇼트헤어드 포인터"),
		D353("저먼 스패니얼 (도이체르 바흐텔훈트)"),
		D354("저먼 스피츠 미텔"),
		D355("저먼 스피츠 클라인"),
		D356("저먼 와이어헤어드 포인터"),
		D357("저먼 핀셔"),
		D358("저먼 하운드 (도이체 브라케)"),
		D359("저먼 헌팅 테리어 (잭 테리어)"),
		D360("제주견"),
		D361("제퍼니즈 스피츠"),
		D362("제퍼니즈 친"),
		D363("제페니즈 테리어"),
		D364("진돗개"),
		D365("차우 차우"),
		D366("차이니즈 샤페이"),
		D367("차이니즈 크레스티드"),
		D368("체서피크 베이 리트리버"),
		D369("체스키 테리어 (체크 테리어"),
		D370("체스키 포우세크 (보헤미안 와이어 헤어드 포인팅 그리폰)"),
		D371("체코슬로바키언 울프독"),
		D372("치르네코 델레트나"),
		D373("치와와"),
		D374("카 드 보 (페로 드 프레사 마요르킨)"),
		D375("카나리안 와런 하운드 (포뎅코 카나리오)"),
		D376("카네코르소 (이탈리안 코르소 독, 케인 코르소)"),
		D377("카넬로-피니쉬 라이카"),
		D378("카렐리언 베어 독"),
		D379("카르스트 세퍼드 독"),
		D380("카스트로 라보레이로 독 (포르투기즈 캐틀 독)"),
		D381("카이"),
		D382("카탈란 쉽 독 (카탈로니안 쉽 독)"),
		D383("캐벌리어 킹 찰스 스패니얼"),
		D384("컬리 코티드 리트리버"),
		D385("케리 블루 테리어"),
		D386("케언 테리어"),
		D387("케이넌 독"),
		D388("케털런 쉽독"),
		D389("코몬도르"),
		D390("코카 스파니엘"),
		D391("코카시안 오브차카 (코카시언 세퍼드 독)"),
		D392("코카프"),
		D393("코튼 드 툴리어"),
		D394("콜리"),
		D395("콜리 러프"),
		D396("콜리 스무스"),
		D397("콜스-헤어드 스타리언 하운드"),
		D398("쿠바츠"),
		D399("쿠이커혼제"),
		D400("크로아티안 세퍼트 독 (흐르바트스키 오브차르)"),
		D401("크로아티안 쉽독"),
		D402("크롬폴란데"),
		D403("클럼버 스패니엘"),
		D404("키슈"),
		D405("키스혼드 (울프스피츠)"),
		D406("킹 찰스 스패니얼"),
		D407("타이 리지백 독"),
		D408("타이 방케우 독"),
		D409("타이완 독"),
		D410("타트러 세퍼드 독"),
		D411("터브렌 (벨지언 세퍼드 독)"),
		D412("텔로미안"),
		D413("토르냐크"),
		D414("토이 맨체스터 테리어"),
		D415("토이 아메리칸 에스키모 독"),
		D416("토이 폭스 테리어"),
		D417("토이 푸들"),
		D418("트란실바니안 하운드 (헝가리안 하운드)"),
		D419("트리잉 워커 쿤하운드"),
		D420("티롤러 브라케 "),
		D421("티롤리언 하운드 (티롤러 브라케)"),
		D422("티베탄 마스티프"),
		D423("티베탄 스패니얼"),
		D424("티베탄 테리어"),
		D425("파라오 하운드"),
		D426("파슨 러셀 테리어"),
		D427("파카르디 스패니얼 (에파뉴엘 파카르디)"),
		D428("파피용"),
		D429("팡 브리타니 바셋"),
		D430("팡 브리터니 그리펀"),
		D431("퍼그"),
		D432("페루비언 헤어리스 독"),
		D433("페르디게이루 포르두게스"),
		D434("페키니즈"),
		D435("페터데일 테리어"),
		D436("포덴구 포르투게스 (포르투게스 워렌 하운드)"),
		D437("포르투기 와런 하운드-포르투기 포덴코"),
		D438("포르투기 포인팅 독"),
		D439("포르투기즈 쉽독"),
		D440("포르투기즈 워터 독"),
		D441("포메라니언 (토이 스피츠)"),
		D442("포사바츠 하운드"),
		D443("포인터"),
		D444("폭스 테리어/스무스 폭스 테리어"),
		D445("폭스 테리어/와이어 폭스 테리어"),
		D446("폴리시 그레이 하운드"),
		D447("폴리시 로렌드 쉽독"),
		D448("폴리시 타트라 쉽독 (오우짜렉 포드할안스키)"),
		D449("폴리시 하운드 (오가르 폴스키)"),
		D450("폴리시 헌팅 독"),
		D451("폼피츠"),
		D452("퐁도드메르 스패니얼"),
		D453("퐁-오드메르 스파니얼 (에파뉴엘 퐁 오드메)"),
		D454("푸델포인터"),
		D455("푸들/미니어처 푸들"),
		D456("푸들/미디엄 푸들"),
		D457("푸들/스텐다드 푸들"),
		D458("푸들/토이 푸들"),
		D459("푸미"),
		D460("풀리"),
		D461("풍산개"),
		D462("프레사 까나리오 (도고 까나리오)"),
		D463("프렌치 불독"),
		D464("프렌치 스패니얼 (에파뉴엘 프랑세)"),
		D465("프렌치 와이어-헤어드 코르탈스 포인팅 그리펀"),
		D466("프렌치 워터 독"),
		D467("프렌치 트라이컬러 하운드 (프랑세 트리콜로)"),
		D468("프렌치 포인팅 독/가스콩타입"),
		D469("프렌치 포인팅 독/피레네타입"),
		D470("프렌치 화이트 앤드 블랙 하운드"),
		D471("프렌치 화이트 앤드 오렌지 하운드"),
		D472("프리전 포인팅 독"),
		D473("프리지언 워터 독"),
		D474("프와트방"),
		D475("프티 바세 그리펀 방데"),
		D476("프티 브라반송"),
		D477("프티 블뢰 드 가스코뉴"),
		D478("플랫 코티드 리트리버"),
		D479("플롯 하운드"),
		D480("피니쉬 레인디어 허더"),
		D481("피니시 라프훈드"),
		D482("피니시 랩훈트"),
		D483("피니시 스피츠"),
		D484("피니시 하운드"),
		D485("피레니언 마스티프"),
		D486("피레니언 마운틴 독 (그레이트 피레니즈)"),
		D487("피레니언 셰퍼드 (피레니안 쉽독, 스무스 페이스드)"),
		D488("피카디 스패니얼"),
		D489("필드 스패니얼"),
		D490("필라 브라질레이로 (브라질리안 마스티프)"),
		D491("하노버 하운드"),
		D492("하노베리언 센트하운드"),
		D493("하바니스"),
		D494("하이젠 하운드 (히겐훈드)"),
		D495("할덴 하운드"),
		D496("해리어"),
		D497("허베너스 (바바네즈, 하바니즈)"),
		D498("헝가리안 그레이 하운드"),
		D499("헝가리언 쇼트-헤어드 포인터(비즐라)"),
		D500("헝가리언 와이어-헤어드 포인터(비즐라)"),
		D501("헤밀턴 하운드"),
		D502("헤밀턴스토바레 (헤밀턴 하운드)"),
		D503("헬레닉 하운드"),
		D504("호르타야 보르자야"),
		D505("호바와트"),
		D506("홋카이도 (아이누견)"),
		D507("화이트 셰퍼드 독 (바이서 슈비아처 셰페르훈트)"),
		D508("화이트 스위스 셰퍼드 독"),
		D509("휘펫"),
		ETC1("소형"),
		ETC2("중형"),
		ETC3("대형")
		;
		
		private String label;
		
		BreedType(String label) { this.label = label; }
		
		@Override
		public String getCode() { return name(); }

		@Override
		public String getLabel() { return label; }
		
	    public static String getBreedType(String code) {
	        for (BreedType breedType : BreedType.values()) {
	            if (code.equals(breedType.getCode())) {
	                return breedType.getLabel();
	            }
	        }
	        return null;
	    }
	}
}	