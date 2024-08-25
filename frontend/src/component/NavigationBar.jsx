import styled from "styled-components";
import { MdHomeFilled } from "react-icons/md";
import { useNavigate } from "react-router-dom";

export const NavigationBar = () => {
    const navigate = useNavigate();

    return (
        <Header>
            <Logo onClick={() => {navigate("/");}}>Chapter.2</Logo>
            <div>
                <ListItem href="/funding">펀딩</ListItem>
                <ListItem href="/education">교육</ListItem>
                <ListItem href="/company">회사</ListItem>
            </div>
            <div>
                <ListItem href="/login">로그인</ListItem>
                <ListItem href="/join">회원가입</ListItem>
            </div>
        </Header>
    )
}

export const Background = styled.div`
    width: 100vw;
    height: 100vh;
`;

export const Header = styled.header`
    width: 90vw;
    height: 10vh;
    border-bottom: 1px solid #D0D0D0;
    line-height: 10vh;
    display: flex;
    justify-content: space-between;
    padding: 0 5vw;
`;

export const Logo = styled.span`
    font-family: 'Pretendard-Regular';
    font-weight: bolder;
    font-size: 40px;
`;

export const ListItem = styled.a`
    text-decoration: none;
    font-family: 'Pretendard-Regular';
    font-weight: bold;
    margin: 0 2vw;
`