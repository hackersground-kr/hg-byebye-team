import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const NavItem = (props) => (
    <span className="text-gray-600 text-sm cursor-pointer hover:text-gray-800 transition-colors">
      {props.text}
    </span>
  )

export function Header() {
    const navigate = useNavigate();
    return (
        <header className="flex flex-col sm:flex-row justify-between items-center mb-12">
        <h1 className="text-3xl font-bold mb-4 sm:mb-0" onClick={() => {navigate("/");}}>Chapter2</h1>
        <nav className="flex space-x-6">
            <a href="/education"><NavItem text="교육"/></a>
            <a href="/company"><NavItem text="기업" /></a>
            <a href="/meet"><NavItem text="회의" /></a>
            <a href="/login"><NavItem text="로그인" /></a>
            <a href="/join"><NavItem text="회원가입" /></a>
        </nav>
        </header>
    )
    
}

export const Background = styled.div`
    width: 100vw;
    height: 100vh;
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