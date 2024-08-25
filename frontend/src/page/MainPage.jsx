import { useState } from "react";
import styled from "styled-components"

const Background = styled.div`
    width: 100%;
    height: 100%;
`;

const BannerImage = styled.img`
    height: 100%;
    width: 100%;
`;

const BannerImageWrap = styled.div`
    margin: 0 auto;
    height: 30%;
    width: 66%;
    margin-top: 3vh;
    margin-bottom: 3vh;
`;

const BoardBackground = styled.div`
    width: 35%;
    height: 40%;
    border: 1px solid black;
    padding: 3%;
`;

const Title = styled.span`
    font-weight: bolder;
    font-size: 25px;
`;

const BoardList = styled.div`
    display: flex;
    justify-content: center;
    width: 100%;
    height: 100%;
`;

const AllView = styled.a`
    text-decoration: none;
    color: gray;
    font-family: 'Pretendard-Regular';
`;

const ItemList = styled.div`
    height: 4vh;
    width: 100%;
    border-bottom: 1px solid #D0D0D0;
    display: flex;
    justify-content: space-between;
`;

const Banner = (props) => {
    return (
        <BannerImageWrap>
            <BannerImage src={props.src}></BannerImage>
        </BannerImageWrap>
    )
}

const Board = (props) => {
    const [itemList, setItemList] = useState([
        {title: "마늘 관련 창업할 사람 구함", writer: "서승훈"},
        {title: "마늘 관련 창업할 사람 구함", writer: "서승훈"},
        {title: "마늘 관련 창업할 사람 구함", writer: "서승훈"}
    ])

    return (
        <BoardBackground>
            <div style={{"display": "flex", "justifyContent": "space-between"}}>
                <Title>{props.title}</Title>
                <AllView>
                    전체보기
                </AllView>
            </div>
            
            <div style={{"width": "100%", "height": "100%"}}>
                {itemList.map((item, index) => {
                    return(
                        <ItemList key={index}>
                            <p>{item.title}</p>
                            <p>{item.writer}</p>
                        </ItemList>
                    )
                })}
            </div>
        </BoardBackground>
    )
}

const MainPage = () => {
    return (
        <Background>
            <Banner src="/banner.jpeg"/>

            <BoardList>
                <Board title="구인">
                </Board>
                <Board title="구직"></Board>
            </BoardList>
        </Background>
    );
}

export default MainPage;